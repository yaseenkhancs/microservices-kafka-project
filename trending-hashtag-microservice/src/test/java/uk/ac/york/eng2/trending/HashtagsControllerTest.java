package uk.ac.york.eng2.trending;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class HashtagsControllerTest {
	
	@Inject
	HashtagsClient client;
	
//	@Inject
//	HashtagsRepository repo;
	
	
//	@BeforeEach
//	void clean() {
//		repo.deleteAll();
//	}
	
//	@Test
//	public void HashtagsTest() { 
//		Iterable<Hashtag> iterUser = client.list();
//		assertFalse(iterUser.iterator().hasNext(), "Service should not list any books initially");
//	}

}
