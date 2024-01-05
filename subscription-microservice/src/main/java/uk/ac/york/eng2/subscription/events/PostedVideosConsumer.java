package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.controllers.VideosController;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.VideoDTO;

@KafkaListener(groupId="books-debug")
public class PostedVideosConsumer {
	
	@Inject
	VideosController controller;
	
	@Topic("video-posted")
	public void videoPostedMetric(@KafkaKey long k, Video v) {
		VideoDTO dto = new VideoDTO();
		dto.setId(v.getId());
		dto.setTitle(v.getTitle());		
		dto.setNlikes(0);
		dto.setNdislikes(0);
		dto.setNviews(0);		
	}
	
	@Topic("user-added")
	public void addedUser(@KafkaKey long k, User u) {
		System.out.println(u.getUsername());
	}
	
	@Topic("hashtag-added")
	public void addedHashtag(@KafkaKey long k, Hashtag h) {
		System.out.println(h.getName());
	}
}
