package uk.ac.york.eng2.trending.events;

import java.time.Duration;
import java.util.Properties;
import java.util.HashMap;

import javafx.util.Pair;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.kstream.Reducer;
import org.apache.kafka.streams.kstream.SlidingWindows;
import org.apache.kafka.streams.kstream.Transformer;
import org.apache.kafka.streams.kstream.TransformerSupplier;
import org.apache.kafka.streams.kstream.ValueTransformerSupplier;
import org.apache.kafka.streams.kstream.Windowed;
import org.apache.kafka.streams.processor.ProcessorContext;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.trending.domain.Hashtag;

@Factory
public class TrendingStreams {

	public static final String TOPIC_LIKED_BY_HOUR = "video-liked-by-hour";

	@Inject
	private SerdeRegistry serdeRegistry;

	@Singleton
	public KStream<Long, Hashtag> liked(ConfiguredStreamBuilder builder) {
		
		Reducer<Long> thisreducer = new Reducer<Long>() {
			@Override
			public Long apply(Long aggvalue, Long currvalue) {
				return Math.max(aggvalue, currvalue);
			}
		};
		
		//removes the older times
		Reducer<Pair<Long, Long>> timereducer = new Reducer<Pair<Long, Long>>() {
			@Override
			public Pair<Long, Long> apply(Pair<Long, Long> value1, Pair<Long, Long> value2) {
				if (value1.getKey() > value2.getKey()) {
					return value1;
				}
				else {
					return value2;
				}
			}
		};
		
		KeyValue<Long, Pair<Long, Long>> retoorn;
		
		TransformerSupplier <Windowed<Long>, Long, KeyValue<Long, Pair<Long, Long>>> mySupplier
			= () -> new Transformer<Windowed<Long>, Long, KeyValue<Long, Pair<Long, Long>>>() {

				@Override
				public void init(ProcessorContext context) {					
				}

				@Override
				public KeyValue<Long, Pair<Long, Long>> transform(Windowed<Long> key, Long value) {
					Long newkey = value;
					Pair<Long, Long> newpair = new Pair<Long, Long>(key.window().end(), value);
					return KeyValue.pair(newkey, newpair);
				}

				@Override
				public void close() {
				}
				
			};
			
		
		
		Properties props = builder.getConfiguration();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "videos-metrics");
		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);

		KStream<Long, Hashtag> videosStream = builder
			.stream(VideosProducer.TOPIC_LIKED, Consumed.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)));
		
		videosStream.peek((key, value) -> System.out.println("INPUT STREAM key : " + key + " value " + value.getName()));
		
//		Pair<>
		
		Duration timeDifference = Duration.ofMinutes(5);
		Duration gracePeriod = Duration.ofMillis(500);
		//change to hashtag as the input id
		KStream<Long, Long> stream = videosStream
			.selectKey((k, v) -> v.getId())
			.peek((k, v) -> System.out.println("NEW KEY: " + k + " NEW VALUE: " + v))
			.groupByKey(Grouped.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)))
			.windowedBy(SlidingWindows.withTimeDifferenceAndGrace(timeDifference, gracePeriod))
			.count(Materialized.as("liked-by-hour"))
			.toStream()
			.transform(mySupplier)		
			.peek((k, v) -> System.out.println("Hiya! : " + k + v))
//			.selectKey((k, v) -> new Pair<Long, Long>(k.window().end(), k.key()))
			.groupByKey(Grouped.with(Serdes.Long(), serdeRegistry.getSerde(Pair.class))
			.reduce(timereducer, Materialized.as("aggregated"))
			.toStream()
			.peek((key, value) -> System.out.println("SECOND STREAM key: " + key + " value: " + value)));
		
		stream.to(TOPIC_LIKED_BY_HOUR, Produced.with(Serdes.Long(), Serdes.Long()));

		return videosStream;
	}
}