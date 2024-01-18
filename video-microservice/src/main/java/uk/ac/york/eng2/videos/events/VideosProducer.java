package uk.ac.york.eng2.videos.events;

import java.util.ArrayList;
import java.util.Collection;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.helpers.HashtagUserPair;

@KafkaClient
public interface VideosProducer extends BaseVideosProducer {
	
//	HashMap<String, Video> userVideo = new HashMap<String, Video>();

	/*
	 * NOTE: this topic has to be created before we start the program, or we will
	 * have an error from Kafka Streams.
	 */
	String TOPIC_WATCHED = "video-watched";
	String TOPIC_LIKED = "video-liked";
	String TOPIC_DISLIKED = "video-disliked";
	String TOPIC_POSTED = "video-posted";
	String TOPIC_USRADDED = "user-added";
	String TOPIC_HASHTAGADDED = "hashtag-added";
	String TOPIC_ADDITIONALHASHTAG = "another-hashtag";
	String TOPIC_WATCHERADDED = "watcher-added";

	@Topic(TOPIC_WATCHED)
	void watchVideo(@KafkaKey Long id, Video video);
	
	@Topic(TOPIC_LIKED)
	void likeVideo(@KafkaKey long h, Hashtag v);
	
	@Topic(TOPIC_DISLIKED)
	void dislikeVideo(@KafkaKey Long id, Video video);
	
	@Topic(TOPIC_POSTED)
	void postVideo(@KafkaKey HashtagUserPair hup, Video video);
	
	@Topic(TOPIC_USRADDED)
	void addUser(@KafkaKey Long id, User user);
	
	@Topic(TOPIC_HASHTAGADDED)
	void addHashtag(@KafkaKey Long id, Hashtag hashtag);
	
	@Topic(TOPIC_ADDITIONALHASHTAG)
	void addAnotherHashtag(@KafkaKey Long videoId, Long hashtagId);
	
	@Topic(TOPIC_WATCHERADDED)
	void addWatcher(@KafkaKey Long videoId, Long userId);

}

