package uk.ac.york.eng2.trending.events;

import java.time.Duration;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.kstream.TimeWindows;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.trending.domain.Video;


@Factory
public class TrendingStreams {

	public static final String TOPIC_LIKED_BY_HOUR = "video-liked-by-hour";

	@Inject
	private SerdeRegistry serdeRegistry;

	@Singleton
	public KStream<Long, Video> watched(ConfiguredStreamBuilder builder) {
		Properties props = builder.getConfiguration();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "videos-metrics");
		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);

		KStream<Long, Video> videosStream = builder
			.stream(VideosProducer.TOPIC_LIKED, Consumed.with(Serdes.Long(), serdeRegistry.getSerde(Video.class)));

		KStream<WindowedIdentifier, Long> stream = videosStream.groupByKey()
			.windowedBy(TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofHours(1)))
			.count(Materialized.as("liked-by-hour"))
			.toStream()
			.selectKey((k, v) -> new WindowedIdentifier(k.key(), k.window().start(), k.window().end()));

		stream.to(TOPIC_LIKED_BY_HOUR,
			Produced.with(serdeRegistry.getSerde(WindowedIdentifier.class), Serdes.Long()));

		return videosStream;
	}
}