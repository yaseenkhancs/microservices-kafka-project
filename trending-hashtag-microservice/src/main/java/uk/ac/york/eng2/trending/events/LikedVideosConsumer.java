package uk.ac.york.eng2.trending.events;

import java.time.Instant;
import java.util.ArrayList;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.controllers.HashtagsController;
import uk.ac.york.eng2.trending.helpers.Hashtag;

@KafkaListener(groupId = "books-debug")
public class LikedVideosConsumer {	
	
	@Inject
	HashtagsController control;
			
	@Topic("video-liked")
	public void videoLikeMetric(@KafkaKey long v, Hashtag h) {
		System.out.println("Haha");
	}
	
//	@Topic("video-liked-by-hour")
//	public void videoLikeHourMetric(@KafkaKey long v, Hashtag h) {
//		System.out.println("Haha");
//	}
}
