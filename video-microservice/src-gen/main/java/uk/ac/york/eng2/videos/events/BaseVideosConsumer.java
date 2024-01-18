package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

public class BaseVideosConsumer {
	
	@Topic("post-video")
	public void postvideo(@KafkaKey Long k, Video v) {
			
	}

}