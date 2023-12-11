package uk.ac.york.eng2.videos.events;

import java.util.ArrayList;
import java.util.Collection;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.Video;

@KafkaClient
public interface VideosProducer {
	
//	HashMap<String, Video> userVideo = new HashMap<String, Video>();

	/*
	 * NOTE: this topic has to be created before we start the program, or we will
	 * have an error from Kafka Streams.
	 */
	String TOPIC_WATCHED = "video-watched";
	String TOPIC_LIKED = "video-liked";
	String TOPIC_DISLIKED = "video-disliked";
	String TOPIC_POSTED = "video-posted";

	@Topic(TOPIC_WATCHED)
	void watchVideo(@KafkaKey Long id, String username);
	
	@Topic(TOPIC_LIKED)
	void likeVideo(@KafkaKey long h, Hashtag v);
	
	@Topic(TOPIC_DISLIKED)
	void dislikeVideo(@KafkaKey Long id, Video video);
	
	@Topic(TOPIC_POSTED)
	void postVideo(@KafkaKey Long id, Video video);

}

