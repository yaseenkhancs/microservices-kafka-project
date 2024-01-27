package uk.ac.york.eng2.subscription;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.HashtagDTO;
import uk.ac.york.eng2.subscription.dto.UserDTO;
import uk.ac.york.eng2.subscription.dto.VideoDTO;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import uk.ac.york.eng2.subscription.repositories.VideosRepository;

@MicronautTest
public class HashtagsControllerTest {
	
	@Inject
	HashtagsClient client;
	
	@Inject
	HashtagsRepository repo;
	
	@Inject
	VideosRepository videosrepo;
	
	@Inject
	UsersRepository usersrepo;
	
	
	@BeforeEach
	void clean() {
		repo.deleteAll();
		videosrepo.deleteAll();
		usersrepo.deleteAll();
	}
	
	@Test
	public void noHashtags() { 
		Iterable<Hashtag> iterUser = client.list();
		assertFalse(iterUser.iterator().hasNext(), "Service should not list any books initially");
	}
	
	@Test
	public void HashtagTests() {
		
		
		Hashtag newhashtag = new Hashtag();
		newhashtag.setId((long)1);
		newhashtag.setName("sad");
		
		HttpResponse<Void> response = client.add(newhashtag);
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Creation should be successful");		
		assertEquals(client.list().iterator().next().getId(), (long)1, "Hashtag ID should be 1");		
		assertEquals(client.list().iterator().next().getName(), "sad", "Hashtag name should be sad");
		
		
		
		
	}

}
