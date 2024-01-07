package video-microservice.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface HelloProducer {

	String VIDEOPOSTED = "video-posted"
	
	@Topic("video-posted")
	void videoposted(@KafkaKey LongLOL k, Video v);

}