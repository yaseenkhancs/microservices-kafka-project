package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

public interface BaseSubscriptionProducer {
	
	String BASE_TOPIC_VIDEOWATCHED = "video-watched";
	String BASE_TOPIC_VIDEOLIKED = "video-liked";
	String BASE_TOPIC_VIDEODISLIKED = "video-disliked";
	String BASE_TOPIC_VIDEOPOSTED = "video-posted";
	String BASE_TOPIC_USERADDED = "user-added";
	String BASE_TOPIC_HASHTAGADDED = "hashtag-added";
	String BASE_TOPIC_ANOTHERHASHTAG = "another-hashtag";
	String BASE_TOPIC_WATCHERADDED = "watcher-added";
	String BASE_TOPIC_USERSUBSCRIBED = "user-subscribed";
	String BASE_TOPIC_USERUNSUBSCRIBED = "user-unsubscribed";
	
	void subscribed(@KafkaKey long k, long v);
	
	void unsubscribed(@KafkaKey long k, long v);
	

}