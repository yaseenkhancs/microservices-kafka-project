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
import uk.ac.york.eng2.videos.dto.VideoDTO;
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
		User newuser = new User();
		newuser.setId((long)1);
		newuser.setUsername("jack");
		newuser.setWatchedVideos(null);
		
		Hashtag newhashtag = new Hashtag();
		newhashtag.setId((long)2);
		newhashtag.setName("sad");
		newhashtag.setTaggedVideos(null);
		
		HashSet<Hashtag> x = new HashSet<Hashtag>();
		x.add(newhashtag);
		
		VideoDTO dto = new VideoDTO();
		
		dto.setTitle("Sample Text");
		dto.setAuthor(newuser);
		dto.setTags(x);
		
		HttpResponse<Void> response = client.add(dto);
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Update should be successful");
		
//		assertTrue(client.list().iterator().next().getAuthor()
//				.getId().equals((long)(2)), "Author ID should be 2");
		
	}

}
