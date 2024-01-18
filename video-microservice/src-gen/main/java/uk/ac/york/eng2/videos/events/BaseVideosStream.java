package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import org.apache.kafka.streams.kstream.KStream;
import uk.ac.york.eng2.videos.domain.Video;

public class BaseVideosStream {

	public KStream<uk.ac.york.eng2.videos.helpers.HashtagUserPair, Video> PostVideo(ConfiguredStreamBuilder builder){
		return null;
	}	
}