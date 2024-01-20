package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.subscription.domain.Video;

@KafkaClient
public interface VideosProducer extends BaseSubscriptionProducer {
	
//	HashMap<String, Video> userVideo = new HashMap<String, Video>();

	/*
	 * NOTE: this topic has to be created before we start the program, or we will
	 * have an error from Kafka Streams.
	 */
	String TOPIC_LIKED = "video-liked";
	String TOPIC_POSTED = "video-posted";
	String TOPIC_SUBSCRIBED = "user-subscribed";
	String TOPIC_UNSUBSCRIBED = "user-unsubscribed";
		
	@Topic(TOPIC_SUBSCRIBED)
	void subscribed(@KafkaKey long userId, long hashtagId);
	
	@Topic(TOPIC_UNSUBSCRIBED)
	void unsubscribed(@KafkaKey long userId, long hashtagId);
	
}
