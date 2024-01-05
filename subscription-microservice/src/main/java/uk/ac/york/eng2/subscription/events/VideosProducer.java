package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.subscription.domain.Video;

@KafkaClient
public interface VideosProducer {
	
//	HashMap<String, Video> userVideo = new HashMap<String, Video>();

	/*
	 * NOTE: this topic has to be created before we start the program, or we will
	 * have an error from Kafka Streams.
	 */
	String TOPIC_LIKED = "video-liked";
	String TOPIC_POSTED = "video-posted";
	
	@Topic(TOPIC_POSTED)
	void postVideo(@KafkaKey Long id, Video video);

	@Topic(TOPIC_LIKED)
	void likeVideo(@KafkaKey Long id, Video v);
//	void likeVideo(@KafkaKey Long id, Hashtag h);
	
}
