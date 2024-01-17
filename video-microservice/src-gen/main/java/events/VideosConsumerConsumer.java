package myassessment.videomicroservice.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener
public class VideosConsumerConsumer {
	
	@Topic("video-liked")
	public void videoliked(@KafkaKey Long k, Video v) {
	
	}
	@Topic("video-posted")
	public void videoposted(@KafkaKey Long k, Video v) {
	
	}

}