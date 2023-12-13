package uk.ac.york.eng2.trending.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.trending.domain.Hashtag;
import uk.ac.york.eng2.trending.domain.Video;

@KafkaClient
public interface VideosProducer {
	
//	HashMap<String, Video> userVideo = new HashMap<String, Video>();

	/*
	 * NOTE: this topic has to be created before we start the program, or we will
	 * have an error from Kafka Streams.
	 */
	String TOPIC_LIKED = "video-liked";

	@Topic(TOPIC_LIKED)
	void likeVideo(@KafkaKey Long id, Video v);
//	void likeVideo(@KafkaKey Long id, Hashtag h);
	
}

