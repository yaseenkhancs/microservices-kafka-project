package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.subscription.domain.Video;

/**
 * Kafka client for producing events in the subscription microservice 
 * <p>
 * This single class contains all the different methods, tagged
 * with the topic that they all correspond to. 
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@KafkaClient
public interface VideosProducer extends BaseSubscriptionProducer {
	
	String TOPIC_LIKED = "video-liked";
	String TOPIC_POSTED = "video-posted";
	String TOPIC_SUBSCRIBED = "user-subscribed";
	String TOPIC_UNSUBSCRIBED = "user-unsubscribed";
		
	@Topic(TOPIC_SUBSCRIBED)
	void subscribed(@KafkaKey long userId, long hashtagId);
	
	@Topic(TOPIC_UNSUBSCRIBED)
	void unsubscribed(@KafkaKey long userId, long hashtagId);
	
}
