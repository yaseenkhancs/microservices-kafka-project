package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

public class BaseVideosConsumer {
	
	@Topic("post-Video")
	public void postvideo(@KafkaKey uk.ac.york.eng2.videos.helpers.HashtagUserPair k, Video v) {
			
	}

}