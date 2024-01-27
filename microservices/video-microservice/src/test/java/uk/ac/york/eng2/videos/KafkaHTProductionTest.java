package uk.ac.york.eng2.videos;

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
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.dto.HashtagDTO;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

@MicronautTest(environments = "no_streams")
@Property(name = "spec.name", value = "KafkaHTProductionTest")
public class KafkaHTProductionTest {
	
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
	
	private static final Map<Long, Hashtag> addedHashtags = new HashMap<>();
	
	
	@Test
	public void HashtagTests() {
		
		
		HashtagDTO newhashtag = new HashtagDTO();
		newhashtag.setName("sad");
		
		HttpResponse<Void> response = hclient.add(newhashtag);
		Awaitility.await().atMost(Duration.ofSeconds(30)).until(() -> addedHashtags.containsKey((long) 1));
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Creation should be successful");		
		assertEquals(hclient.list().iterator().next().getId(), (long)1, "Hashtag ID should be 1");		
		assertEquals(hclient.list().iterator().next().getName(), "sad", "Hashtag name should be sad");
		
	}
	
	@Requires(property="spec.name", value="KafkaHTProductionTest")
	@KafkaListener(groupId = "kafka-production-test-ht")
	static class TestConsumerAgain {
		@Topic (VideosProducer.TOPIC_HASHTAGADDED)
		void addHashtag(@KafkaKey Long id, Hashtag h) {
			addedHashtags.put(id, h);
		}
	}

}
