package uk.ac.york.eng2.trending.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.trending.domain.Video;

@KafkaListener(groupId = "books-debug")
public class BooksConsumer {

	@Topic("video-liked")
	public void bookReadMetric(@KafkaKey long id, Video count) {
		System.out.printf("New value for key %s: %d%n", id, count);
	}

//	@Topic(TrendingStreams.TOPIC_WATCHED_BY_HOUR)
//	public void readBook(@KafkaKey Long id, Video book) {
//		System.out.printf("Book read: %d%n", id);
//	}
}
