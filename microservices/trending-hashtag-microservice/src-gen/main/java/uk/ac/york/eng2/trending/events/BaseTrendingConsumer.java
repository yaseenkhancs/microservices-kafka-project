package uk.ac.york.eng2.trending.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.trending.domain.HashtagCount;

public class BaseTrendingConsumer {
	
	public void videoLikeMetric(@KafkaKey long k, uk.ac.york.eng2.trending.helpers.Hashtag v) {
			
	}

}