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
import uk.ac.york.eng2.subscription.dto.UserDTO;
import uk.ac.york.eng2.subscription.dto.VideoDTO;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import uk.ac.york.eng2.subscription.repositories.VideosRepository;
import uk.ac.york.eng2.subscription.HashtagsClient;
import uk.ac.york.eng2.subscription.UsersClient;
import uk.ac.york.eng2.subscription.dto.HashtagDTO;

@MicronautTest
public class VideosControllerTest {
	
	@Inject
	VideosClient client;
	
	@Inject
	VideosRepository repo;
	
	@Inject
	UsersRepository usersrepo;
	
	@Inject
	HashtagsRepository htrepo;
	
	@Inject
	UsersClient uclient;
	
	@Inject
	HashtagsClient hclient;
	
	@BeforeEach
	void clean() {
		repo.deleteAll();
		usersrepo.deleteAll();
	}
	
	@Test
	public void videosTest() { 
		Iterable<Video> iterVideo = client.list();
		assertFalse(iterVideo.iterator().hasNext(), "Service should not list any books initially");
	}
	
	@Test
	public void getVideo() {			
		
		User newuser = new User();
		newuser.setId((long)1);
		newuser.setUsername("jack");
		uclient.add(newuser);
		
		Hashtag newhashtag = new Hashtag();
		newhashtag.setId((long)2);
		newhashtag.setName("sad");		
		hclient.add(newhashtag);
		
		HashSet<Hashtag> x = new HashSet<Hashtag>();
		x.add(newhashtag);
		
		VideoDTO dto = new VideoDTO();
		dto.setId((long) 3);
		dto.setTitle("Sample Text");
		dto.setAuthor(newuser);
		dto.setTags(x);
		
		HttpResponse<Void> response = client.add(dto);
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Update should be successful");
		
		assertTrue(client.list().iterator().next().getTitle()
				.equals("Sample Text"), "Title should be sample text");
		
		assertTrue(client.list().iterator().next().getNlikes()
				.equals(0), "should have 0 likes");
		
		assertTrue(client.list().iterator().next().getNdislikes()
				.equals(0), "should have 0 dislikes");
		
		assertTrue(client.list().iterator().next().getNviews()
				.equals(0), "should have 0 views");
		
	}


}
