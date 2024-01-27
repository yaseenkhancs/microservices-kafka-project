package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

public class BaseSubscriptionConsumer {
	
	public void videoPostedMetric(@KafkaKey uk.ac.york.eng2.subscription.helpers.HashtagUserPair k, Video v) {
			
	}
	
	public void addedUser(@KafkaKey long k, User v) {
			
	}
	
	public void addedHashtag(@KafkaKey long k, Hashtag v) {
			
	}
	
	public void anotherHashtag(@KafkaKey long k, long v) {
			
	}
	
	public void watcherAdded(@KafkaKey long k, long v) {
			
	}

}