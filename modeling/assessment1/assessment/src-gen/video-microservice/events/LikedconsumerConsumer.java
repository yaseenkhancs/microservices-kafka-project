package video-microservice.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener
public class LikedconsumerConsumer {
	
	@Topic("video-posted")
	public void videoposted(@KafkaKey Long id, Video v) {
	
	}

}