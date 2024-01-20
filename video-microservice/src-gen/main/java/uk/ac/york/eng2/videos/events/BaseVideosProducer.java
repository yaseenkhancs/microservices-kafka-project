package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;

public interface BaseVideosProducer {
	
	String BASE_TOPIC_VIDEOWATCHED = "video-watched";
	String BASE_TOPIC_VIDEOLIKED = "video-liked";
	String BASE_TOPIC_VIDEODISLIKED = "video-disliked";
	String BASE_TOPIC_VIDEOPOSTED = "video-posted";
	String BASE_TOPIC_USERADDED = "user-added";
	String BASE_TOPIC_HASHTAGADDED = "hashtag-added";
	String BASE_TOPIC_ANOTHERHASHTAG = "another-hashtag";
	String BASE_TOPIC_WATCHERADDED = "watcher-added";
	
	void watchVideo(@KafkaKey Long k, Video v);
	
	void addAnotherHashtag(@KafkaKey Long k, Long v);
	
	void addHashtag(@KafkaKey Long k, Hashtag v);
	
	void addUser(@KafkaKey Long k, User v);
	
	void addWatcher(@KafkaKey Long k, Long v);
	
	void dislikeVideo(@KafkaKey Long k, Video v);
	
	void likeVideo(@KafkaKey long k, Hashtag v);
	
	void postVideo(@KafkaKey uk.ac.york.eng2.videos.helpers.HashtagUserPair k, Video v);
	

}