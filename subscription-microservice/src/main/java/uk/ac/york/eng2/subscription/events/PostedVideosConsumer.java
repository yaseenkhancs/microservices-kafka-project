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
import uk.ac.york.eng2.subscription.dto.VideoDTO;
import uk.ac.york.eng2.subscription.helpers.HashtagUserPair;

/**
 * Kafka client for consuming events in the subscription MS 
 * <p>
 * This single class handles all of the consumption, namely the 
 * consuming of any and all state changes in the video MS, so
 * the posting of users, videos, hashtags, and any changes in 
 * the relationships between these entities such as the adding
 * of hashtags to videos and the adding of watchers to videos.
 * 
 * Mirrors much of the functionality from the video CLI - whereas
 * the video CLI handles getting input from the user and interacting
 * with the controller with the received information, the subscription
 * microservice instead handles the instantiation of video elements
 * via the received kafka topics, so much of that functionality before
 * the actual controller method is called is called here. For example,
 * extracting video information from the kafka event in videopostedmetric,
 * creating the appropriate DTO and then calling the video controller.
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@KafkaListener(groupId="subscription-group")
public class PostedVideosConsumer extends BaseSubscriptionConsumer {
	
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
