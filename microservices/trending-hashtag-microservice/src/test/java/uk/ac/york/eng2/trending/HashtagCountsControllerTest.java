package uk.ac.york.eng2.trending;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.domain.HashtagCount;
import uk.ac.york.eng2.trending.repositories.HashtagCountsRepository;

@MicronautTest
public class HashtagCountsControllerTest {
	
	@Inject
	HashtagCountsClient client;
	
	@Inject
	HashtagCountsRepository repo;
	
	
	@BeforeEach
	void clean() {
		repo.deleteAll();
	}
	
	@Test
	public void HashtagCountsTest() { 
		Iterable<HashtagCount> iterUser = client.list();
		assertFalse(iterUser.iterator().hasNext(), "Service should not list any hashtagcounts initially");
	}
	
	@Test
	public void GetHashtagCountsTest() {
		HashtagCount mynew = new HashtagCount();
		mynew.setName("sad");
		client.add(mynew);
		Iterable<HashtagCount> iterUser = client.list();
		assertTrue(iterUser.iterator().hasNext(), "Service should now have a hashtag count");
		assertEquals(iterUser.iterator().next().getName(), "sad", "Hashtag name should be sad");
		assertTrue(iterUser.iterator().next().getTimeStamp() > 10000, "timestamp should be a large value!");
	}

}
