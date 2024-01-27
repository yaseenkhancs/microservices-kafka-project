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
	public void noVideos() { 
		Iterable<Video> iterVideo = client.list();
		assertFalse(iterVideo.iterator().hasNext(), "Service should not list any books initially");
	}
	
	@Test
	public void getVideo() {			
		
		UserDTO newuser = new UserDTO();
		newuser.setUsername("jack");
		uclient.add(newuser);
		
		HashtagDTO newhashtag = new HashtagDTO();
		newhashtag.setName("sad");		
		hclient.add(newhashtag);
		
		HashSet<Hashtag> x = new HashSet<Hashtag>();
		Hashtag newtag = new Hashtag();
		newtag.setId((long)2);
		newtag.setName(newhashtag.getName());
		x.add(newtag);
		
		User thisuser = new User();
		thisuser.setId((long)1);
		thisuser.setUsername(newuser.getUsername());
		
		VideoDTO dto = new VideoDTO();
		
		dto.setTitle("Sample Text");
		dto.setAuthor(thisuser);
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
