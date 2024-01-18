package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

public interface BaseVideosProducer {
	
	String BASE_TOPIC_VIDEOPOSTED = "video-posted";
	String BASE_TOPIC_WATCHERADDED = "watcher-added";
	
	void postVideo(@KafkaKey uk.ac.york.eng2.videos.helpers.HashtagUserPair k, Video v);
	void addWatcher(@KafkaKey Long k, Long v);

}