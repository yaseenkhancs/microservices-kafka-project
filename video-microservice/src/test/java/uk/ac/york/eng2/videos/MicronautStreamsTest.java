package uk.ac.york.eng2.videos;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KafkaStreams.State;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Requires;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.events.VideosStreams;

@Property(name="spec.name", value="MicronautStreamsTest")
@TestInstance(Lifecycle.PER_CLASS)
@MicronautTest
public class MicronautStreamsTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MicronautStreamsTest.class);
	
	@Inject
	VideosProducer producer;
	
	@Inject
	KafkaStreams kStreams;
	
	private static Map<Long, User> events = new HashMap<>();
	
	@Requires(property="spec.name", value = "MicronautStreamsTest")
	@KafkaListener(groupId="micronaut-streams-test")
	static class StreamsListener{
		
		@Topic(VideosProducer.TOPIC_USRADDED)
		public void userAdded(@KafkaKey long id, User u) {
			events.put(id, u);
		}
	}
	
	@BeforeEach
	public void SetUp() {
		events.clear();
		Awaitility.await().until(()-> kStreams.state().equals(State.RUNNING));
		
	}
	
	@AfterAll
	public void cleanUp() {
		kStreams.close();
	}
	
	@Test
	public void readUserAdded() {
		LOGGER.info("about to send a new event");
		producer.addUser((long) 1, new User());
		LOGGER.info("sent event");
		Awaitility.await().atMost(Duration.ofSeconds(10)).until(() -> !events.isEmpty());
	}
	

}
