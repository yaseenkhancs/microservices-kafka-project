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
				
	}

}
