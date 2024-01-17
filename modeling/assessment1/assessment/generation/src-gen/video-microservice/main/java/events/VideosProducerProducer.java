package video-microservice.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface VideosProducerProducer {

	String VIDEOLIKED = "video-liked"
	String VIDEOPOSTED = "video-posted"
	
	@Topic("video-liked")
	void videoliked(@KafkaKey Long k, Video v);
	@Topic("video-posted")
	void videoposted(@KafkaKey Long k, Video v);

}