package uk.ac.york.eng2.videos.events;


import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.helpers.HashtagUserPair;

/**
 * Kafka client for producing events in the videos microservice 
 * <p>
 * This single class contains all the different methods, tagged
 * with the topic that they all correspond to. 
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@KafkaClient
public interface VideosProducer extends BaseVideosProducer {
	
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

