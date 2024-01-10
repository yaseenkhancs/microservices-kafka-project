package uk.ac.york.eng2.videos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.HashtagDTO;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.helpers.HashtagUserPair;
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
		addedHashtags.clear();
	}
	
	private final Map<Long, Hashtag> addedHashtags = new HashMap<>();
	
	@MockBean(VideosProducer.class)
	VideosProducer testProducer() {
		return new VideosProducer() {

			@Override
			public void addHashtag(Long id, Hashtag hashtag) {
				addedHashtags.put(id, hashtag);
			}
			
			@Override
			public void addUser(Long id, User user) {}
			@Override
			public void watchVideo(Long id, Video video) {}
			@Override
			public void likeVideo(long h, Hashtag v) {}
			@Override
			public void dislikeVideo(Long id, Video video) {}
			@Override
			public void postVideo(HashtagUserPair hup, Video video) {}			
			@Override
			public void addAnotherHashtag(Long videoId, Long hashtagId) {}
			@Override
			public void addWatcher(Long videoId, Long userId) {}
				
			};
			
		};
	
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
		assertTrue(addedHashtags.containsKey((long) 1));
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Creation should be successful");		
		assertEquals(client.list().iterator().next().getId(), (long)1, "Hashtag ID should be 1");		
		assertEquals(client.list().iterator().next().getName(), "sad", "Hashtag name should be sad");
		
		
		
		
	}

}
