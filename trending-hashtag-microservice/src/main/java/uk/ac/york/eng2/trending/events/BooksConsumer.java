package uk.ac.york.eng2.trending.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.books.domain.Book;

@KafkaListener(groupId = "books-debug")
public class BooksConsumer {

	@Topic(BooksStreams.TOPIC_READ_BY_DAY)
	public void bookReadMetric(@KafkaKey WindowedIdentifier window, Long count) {
		System.out.printf("New value for key %s: %d%n", window, count);
	}

	@Topic(BooksProducer.TOPIC_READ)
	public void readBook(@KafkaKey Long id, Book book) {
		System.out.printf("Book read: %d%n", id);
	}
}
