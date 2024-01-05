package uk.ac.york.eng2.subscription.events;

import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.subscription.domain.Video;

@Factory
public class PostedStreams {
	
	@Inject
	private SerdeRegistry serdeRegistry;
	
	@Singleton
	public KStream<Long, Video> liked(ConfiguredStreamBuilder builder) {
		Properties props = builder.getConfiguration();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "videos-metrics");
		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);
		
		KStream<Long, Video> videosStream = builder
				.stream(VideosProducer.TOPIC_LIKED, Consumed.with(Serdes.Long(), serdeRegistry.getSerde(Video.class)));
		
		return videosStream;
	}

}
