package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.subscription.domain.Video;

@KafkaListener(groupId="books-debug")
public class PostedVideosConsumer {
	
	@Topic("video-posted")
	public void videoPostedMetric(@KafkaKey long k, Video v) {
		System.out.println(v.getTitle());
	}

}
