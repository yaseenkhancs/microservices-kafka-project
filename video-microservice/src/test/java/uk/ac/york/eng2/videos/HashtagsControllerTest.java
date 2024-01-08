package uk.ac.york.eng2.videos;

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
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.HashtagDTO;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

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
		
		
		HashtagDTO newhashtag = new HashtagDTO();
		newhashtag.setName("sad");
		
		HttpResponse<Void> response = client.add(newhashtag);
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Creation should be successful");		
		assertEquals(client.list().iterator().next().getId(), (long)1, "Hashtag ID should be 1");		
		assertEquals(client.list().iterator().next().getName(), "sad", "Hashtag name should be sad");
		
		
		
		
	}

}
