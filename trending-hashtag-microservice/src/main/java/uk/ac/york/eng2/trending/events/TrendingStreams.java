package uk.ac.york.eng2.trending.events;

import java.time.Duration;
import java.time.Instant;
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
import uk.ac.york.eng2.trending.helpers.LongPair;


// TODO:

//MAKE TIMEDIFFERENCE A CLASS-WIDE VARIABLE SO IT CAN BE USED TO CALCULATE THE DECAY CHECK IN
//THISREDUCER
@Factory
public class TrendingStreams {

	public static final String TOPIC_LIKED_BY_HOUR = "video-liked-by-hour";

	@Inject
	private SerdeRegistry serdeRegistry;

//	@Singleton
//	public KStream<Long, Hashtag> liked(ConfiguredStreamBuilder builder) {
//		
//		//removes the older times
////		Reducer<LongPair> timereducer = new Reducer<LongPair>() {
////			@Override
////			public LongPair apply(LongPair value1, LongPair value2) {				 
////				if (value1.getFirst() > value2.getFirst()) {
////					return value1;
////				}
////				else {
////					return value2;
////				}
////			}
////		};
//		
//		Reducer<LongPair> thisreducer = new Reducer<LongPair>() {
//			@Override
//			public LongPair apply(LongPair val1, LongPair val2) {
//				Long absoluteTimeDifference = Math.abs(val1.getFirst() - val2.getFirst());
//				if (val1.getSecond() > val2.getSecond() && absoluteTimeDifference < 300000) {
//					return val1;
//				}
//				else {
//					return val2;
//				}
//			}
//		};
//		
//		KeyValue<Long, Pair<Long, Long>> retoorn;
//		
//		TransformerSupplier <Windowed<Long>, Long, KeyValue<Long, LongPair>> mySupplier
//			= () -> new Transformer<Windowed<Long>, Long, KeyValue<Long, LongPair>>() {
//
//				@Override
//				public void init(ProcessorContext context) {					
//				}
//
//				@Override
//				public KeyValue<Long, LongPair> transform(Windowed<Long> key, Long value) {
//					Long newkey = key.key();
//					LongPair newpair = new LongPair(key.window().end(), value);
//					return KeyValue.pair(newkey, newpair);
//				}
//
//				@Override
//				public void close() {
//				}
//				
//			};
//			
//			TransformerSupplier <Long, LongPair, KeyValue<Long, Long>> anotherSupplier
//			= () -> new Transformer<Long, LongPair, KeyValue<Long, Long>>() {
//
//				@Override
//				public void init(ProcessorContext context) {					
//				}
//
//				@Override
//				public void close() {
//				}
//
//				@Override
//				public KeyValue<Long, Long> transform(Long key, LongPair value) {
//					return KeyValue.pair(key, value.getSecond());
//				}
//				
//			};
//			
//		
//		
//		Properties props = builder.getConfiguration();
//		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "videos-metrics");
//		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);
//
//		KStream<Long, Hashtag> videosStream = builder
//			.stream(VideosProducer.TOPIC_LIKED, Consumed.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)));
//		
//		videosStream.peek((key, value) -> System.out.println("INPUT STREAM key : " + key + " value " + value.getName()));
//		
//		Duration timeDifference = Duration.ofMinutes(5);
//		Duration gracePeriod = Duration.ofMillis(500);
//		KStream<Long, Long> stream = videosStream
//			.selectKey((k, v) -> v.getId())
//			.peek((k, v) -> System.out.println("NEW KEY: " + k + " NEW VALUE: " + v))
//			.groupByKey(Grouped.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)))
//			.windowedBy(SlidingWindows.withTimeDifferenceAndGrace(timeDifference, gracePeriod))
//			.count(Materialized.as("huh"))
//			.toStream()
//			.peek((k, v) -> System.out.println("WINDOWED KEY: " + k.toString() + " NEW VALUE: " + v))
//			.transform(mySupplier)	
//			.peek((k, v) -> System.out.println("TRANSFORMED : " + k + ", VALUE: " + v.getFirst() + ", " + v.getSecond()))
//			.groupByKey(Grouped.with(Serdes.Long(), serdeRegistry.getSerde(LongPair.class)))
//			.reduce(thisreducer, Materialized.as("aggregated"))
//			.toStream()
//			.peek((k, v) -> System.out.println("REDUCED : " + k + ", VALUE: " + v.getFirst() + ", " + v.getSecond() + "currtime: " + Instant.now().toEpochMilli()))
//			.transform(anotherSupplier)
//			.peek((key, value) -> System.out.println("SECOND STREAM key: " + key + " value: " + value));
//		
//		stream.to(TOPIC_LIKED_BY_HOUR, Produced.with(Serdes.Long(), Serdes.Long()));
//
//		return videosStream;
//	}
	
	
	
	Reducer<LongPair> thisreducer = new Reducer<LongPair>() {
		@Override
		public LongPair apply(LongPair val1, LongPair val2) {
			Long absoluteTimeDifference = Math.abs(val1.getFirst() - val2.getFirst());
			if (val1.getSecond() > val2.getSecond() && absoluteTimeDifference < 300000) {
				return val1;
			}
			else {
				return val2;
			}
		}
	};
	
	KeyValue<Long, Pair<Long, Long>> retoorn;
	
	TransformerSupplier <Windowed<Long>, Long, KeyValue<Long, LongPair>> mySupplier
		= () -> new Transformer<Windowed<Long>, Long, KeyValue<Long, LongPair>>() {

			@Override
			public void init(ProcessorContext context) {					
			}

			@Override
			public KeyValue<Long, LongPair> transform(Windowed<Long> key, Long value) {
				Long newkey = key.key();
				LongPair newpair = new LongPair(key.window().end(), value);
				return KeyValue.pair(newkey, newpair);
			}

			@Override
			public void close() {
			}
			
		};
		
	TransformerSupplier <Long, LongPair, KeyValue<Long, Long>> anotherSupplier
		= () -> new Transformer<Long, LongPair, KeyValue<Long, Long>>() {

			@Override
			public void init(ProcessorContext context) {					
			}

			@Override
			public void close() {
			}

			@Override
			public KeyValue<Long, Long> transform(Long key, LongPair value) {
				return KeyValue.pair(key, value.getSecond());
			}
			
		};

	
	@Singleton
	public KStream<Long, Hashtag> likedagain(ConfiguredStreamBuilder builder) {

		
		Properties props = builder.getConfiguration();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "subs-stream");
		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);

		KStream<Long, Hashtag> videosStream = builder
			.stream(VideosProducer.TOPIC_LIKED, Consumed.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)))
			.peek((k, v) -> System.out.println("Input stream: " + k + " and " + v));
		
		Duration timeDifference = Duration.ofMinutes(5);
		Duration gracePeriod = Duration.ofMillis(500);
		
//		KStream<Long, Hashtag> stream = videosStream;
//		stream.to(TOPIC_LIKED_BY_HOUR, Produced.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)));
				
		
		KStream<Long, Long> stream = videosStream
			.selectKey((k, v) -> v.getId())
			.peek((k, v) -> System.out.println("NEW KEY: " + k + " NEW VALUE: " + v))
			.groupByKey(Grouped.with(Serdes.Long(), serdeRegistry.getSerde(Hashtag.class)))
			.windowedBy(SlidingWindows.withTimeDifferenceAndGrace(timeDifference, gracePeriod))
			.count(Materialized.as("liked-by-hour"))
			.toStream()
			.peek((k, v) -> System.out.println("WINDOWED KEY: " + k.toString() + " NEW VALUE: " + v))
			.transform(mySupplier)	
			.peek((k, v) -> System.out.println("TRANSFORMED : " + k + ", VALUE: " + v.getFirst() + ", " + v.getSecond()))
			.groupByKey(Grouped.with(Serdes.Long(), serdeRegistry.getSerde(LongPair.class)))
			.reduce(thisreducer, Materialized.as("aggregated"))
			.toStream()
			.peek((k, v) -> System.out.println("REDUCED : " + k + ", VALUE: " + v.getFirst() + ", " + v.getSecond() + "currtime: " + Instant.now().toEpochMilli()))
			.transform(anotherSupplier)
			.peek((key, value) -> System.out.println("SECOND STREAM key: " + key + " value: " + value));
		stream.to(TOPIC_LIKED_BY_HOUR, Produced.with(Serdes.Long(), Serdes.Long()));
		
		return videosStream;
	}
}