package uk.ac.york.eng2.trending.events;

import java.time.Instant;
import java.util.ArrayList;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.trending.domain.Hashtag;
import uk.ac.york.eng2.trending.domain.Video;

@KafkaListener(groupId = "books-debug")
public class LikedVideosConsumer {	
	@Topic("video-liked")
	public void videoLikeMetric(@KafkaKey long v, String h) {
		System.out.printf("New value for key %d: %s%n", v, h);
		System.out.println(Instant.now().toEpochMilli());
	}
}
