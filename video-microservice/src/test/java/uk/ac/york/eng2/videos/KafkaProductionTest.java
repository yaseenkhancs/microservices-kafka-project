package uk.ac.york.eng2.videos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

@MicronautTest(environments = "no_streams")
@Property(name = "spec.name", value = "KafkaProductionTest")
public class KafkaProductionTest {
	
	@Inject
	UsersClient client;
	
	@Inject
	UsersRepository repo;
	
	@Inject
	VideosRepository videosrepo;
	
	@Inject
	HashtagsRepository htrepo;
	
	private static final Map<Long, User> addedUsers = new HashMap<>();
	
	@Test
	public void UserTests() {
		
		UserDTO newuser = new UserDTO();
		newuser.setUsername("jack");
		
		HttpResponse<Void> response = client.add(newuser);
		
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Creation should be successful");		
		assertEquals(client.list().iterator().next().getId(), (long)1, "Author ID should be 1");		
		assertEquals(client.list().iterator().next().getUsername(), "jack", "Author username should be jack");
	}
	
	@Requires(property="spec.name", value="KafkaProductionTest")
	@KafkaListener(groupId = "kafka-production-test")
	static class TestConsumer {
		@Topic (VideosProducer.TOPIC_USRADDED)
		void readBook(@KafkaKey Long id, User u) {
			addedUsers.put(id, u);
		}
	}

}
