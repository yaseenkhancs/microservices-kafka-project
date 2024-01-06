package video-microservice.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener
public class WhoaConsumer {
	
	@Topic("video-posted")
	public void videoposted(@KafkaKey LongLOL k, Video v) {
	
	}

}