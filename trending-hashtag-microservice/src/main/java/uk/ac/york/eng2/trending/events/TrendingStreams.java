package uk.ac.york.eng2.trending.events;

import java.time.Duration;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.kstream.SlidingWindows;
import org.apache.kafka.streams.kstream.TimeWindows;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.trending.domain.Hashtag;
import uk.ac.york.eng2.trending.domain.Video;


@Factory
public class TrendingStreams {

	public static final String TOPIC_LIKED_BY_HOUR = "video-liked-by-hour";

	@Inject
	private SerdeRegistry serdeRegistry;

	@Singleton
	public KStream<Long, Hashtag> liked(ConfiguredStreamBuilder builder) {
		Properties props = builder.getConfiguration();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "videos-metrics");
		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);

		KStream<Long, Hashtag> videosStream = builder
			.stream(VideosProducer.TOPIC_LIKED, Consumed.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)));
		
		videosStream.peek((key, value) -> System.out.println("INPUT STREAM key : " + key + " value " + value.getName()));
		
		Duration timeDifference = Duration.ofHours(1);
		Duration gracePeriod = Duration.ofMillis(500);

		KStream<WindowedIdentifier, Long> stream = videosStream
			.selectKey((k, v) -> v)
			.peek((k, v) -> System.out.println("NEW KEY: " + k + "NEW VALUE: " + v))
			.groupByKey()
			.windowedBy(SlidingWindows.withTimeDifferenceAndGrace(timeDifference, gracePeriod))
			.count(Materialized.as("liked-by-hour"))
			.toStream()
			.selectKey((k, v) -> new WindowedIdentifier(v, k.window().start(), k.window().end()))
			.peek((key, value) -> System.out.println("SECOND STREAM key: " + key + "value: " + value));

		stream.to(TOPIC_LIKED_BY_HOUR, Produced.with(serdeRegistry.getSerde(WindowedIdentifier.class), Serdes.Long()));

		return videosStream;
	}
}