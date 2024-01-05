package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.controllers.HashtagsController;
import uk.ac.york.eng2.subscription.controllers.UsersController;
import uk.ac.york.eng2.subscription.controllers.VideosController;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.UserDTO;
import uk.ac.york.eng2.subscription.dto.VideoDTO;
import uk.ac.york.eng2.subscription.helpers.HashtagUserPair;

@KafkaListener(groupId="books-debug")
public class PostedVideosConsumer {
	
	@Inject
	VideosController controller;
	
	@Inject
	UsersController ucontroller;
	
	@Inject
	HashtagsController hcontroller;
	
	@Topic("video-posted")
	public void videoPostedMetric(@KafkaKey HashtagUserPair hup, Video v) {
		System.out.println("YOOOOOOOOOOOOOOOOO");
		System.out.println(hup.getU().getUsername());
		System.out.println(hup.getH());
		
		VideoDTO dto = new VideoDTO();
		dto.setId(v.getId());
		dto.setTitle(v.getTitle());
		dto.setAuthor(hup.getU());
		dto.setTags(hup.getH());
		dto.setNlikes(0);
		dto.setNdislikes(0);
		dto.setNviews(0);
		dto.setWatchers(null);
		
		controller.add(dto);
	}
	
	@Topic("user-added")
	public void addedUser(@KafkaKey long k, User u) {
		User user = new User();
		user.setId(u.getId());
		user.setUsername(u.getUsername());
		ucontroller.add(user);
	}
	
	@Topic("hashtag-added")
	public void addedHashtag(@KafkaKey long k, Hashtag h) {
		Hashtag hashtag = new Hashtag();
		hashtag.setId(h.getId());
		hashtag.setName(h.getName());
		hcontroller.add(h);
	}
	
	@Topic("another-hashtag")
	public void anotherHashtag(@KafkaKey long videoId, long hashtagId) {
		System.out.println("postedvideosconsumer anotherHashtag() video ID: " + videoId);
		System.out.println("postedvideosconsumer anotherHashtag() hashtag ID: " + hashtagId);
		controller.addHashtag(videoId, hashtagId);
	}
	
	@Topic("watcher-added")
	public void watcherAdded(@KafkaKey long videoId, long userId) {
		System.out.println("postedvideosconsumer watcherAdded() video ID: " + videoId);
		System.out.println("postedvideosconsumer watcherAdded() user ID: " + userId);
		controller.addWatcher(videoId, userId);
	}
}
