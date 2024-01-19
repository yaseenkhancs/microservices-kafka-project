package uk.ac.york.eng2.subscription;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.awaitility.Awaitility;
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
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;
import uk.ac.york.eng2.subscription.dto.HashtagDTO;
import uk.ac.york.eng2.subscription.dto.UserDTO;
import uk.ac.york.eng2.subscription.events.VideosProducer;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import uk.ac.york.eng2.subscription.repositories.VideosRepository;

@MicronautTest(environments = "no_streams")
@Property(name = "spec.name", value = "KafkaProductionTest")
public class KafkaProductionTest {
	
	@Inject
	UsersClient client;
	
	@Inject
	HashtagsClient hclient;
	
	@Inject
	UsersRepository repo;
	
	@Inject
	VideosRepository videosrepo;
	
	@Inject
	HashtagsRepository htrepo;
	
	private static final Map<Long, Long> subbedHashtags = new HashMap<>();
	private static final Map<Long, Long> unSubbedHashtags = new HashMap<>();
	
	@Test
	public void UserTests() {
		
		User newuser = new User();
		newuser.setId((long) 1);
		newuser.setUsername("jack");

		client.add(newuser);
		
		Hashtag newtag = new Hashtag();
		newtag.setId((long) 2);
		newtag.setName("sad");
		
		hclient.add(newtag);
		
		HttpResponse<String> response = client.addSubHashtag(1, 2);
				
		Awaitility.await().atMost(Duration.ofSeconds(3)).until(() -> subbedHashtags.containsKey((long) 1));
		assertEquals(HttpStatus.OK, response.getStatus(), "Creation should be successful");
		
		HttpResponse<String> responseAgain = client.deleteSubHashtag(1, 2);
		
		Awaitility.await().atMost(Duration.ofSeconds(3)).until(() -> unSubbedHashtags.containsKey((long) 1));		
		assertEquals(HttpStatus.OK, responseAgain.getStatus(), "Deletion should be successful");
		
	}
	
	@Requires(property="spec.name", value="KafkaProductionTest")
	@KafkaListener(groupId = "kafka-production-test")
	static class TestConsumer {
		@Topic (VideosProducer.TOPIC_SUBSCRIBED)
		void addUser(@KafkaKey long userid, long hashtagid) {
			subbedHashtags.put(userid, hashtagid);
		}
	}
	
	@Requires(property="spec.name", value="KafkaProductionTest")
	@KafkaListener(groupId = "kafka-production-test")
	static class TestConsumerAgain {
		@Topic (VideosProducer.TOPIC_UNSUBSCRIBED)
		void addUser(@KafkaKey long userid, long hashtagid) {
			unSubbedHashtags.put(userid, hashtagid);
		}
	}

}
