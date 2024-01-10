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
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.helpers.HashtagUserPair;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

@MicronautTest(environments = "no_streams")
public class UsersControllerTest {
	
	@Inject
	UsersClient client;
	
	@Inject
	UsersRepository repo;
	
	@Inject
	VideosRepository videosrepo;
	
	@Inject
	HashtagsRepository htrepo;
	
	
	@BeforeEach
	void clean() {
		repo.deleteAll();
		videosrepo.deleteAll();
		htrepo.deleteAll();
		addedUsers.clear();
	}
	
	@Test
	public void noUsers() { 
		Iterable<User> iterUser = client.list();
		assertFalse(iterUser.iterator().hasNext(), "Service should not list any books initially");
	}
	
	private final Map<Long, User> addedUsers = new HashMap<>();
	
	@MockBean(VideosProducer.class)
	VideosProducer testProducer() {
		return new VideosProducer() {

			@Override
			public void addUser(Long id, User user) {
				addedUsers.put(id, user);
				
			}

			@Override
			public void watchVideo(Long id, Video video) {}
			@Override
			public void likeVideo(long h, Hashtag v) {}
			@Override
			public void dislikeVideo(Long id, Video video) {}
			@Override
			public void postVideo(HashtagUserPair hup, Video video) {}
			@Override
			public void addHashtag(Long id, Hashtag hashtag) {}
			@Override
			public void addAnotherHashtag(Long videoId, Long hashtagId) {}
			@Override
			public void addWatcher(Long videoId, Long userId) {}
				
			};
			
		};
	
	
	@Test
	public void UserTests() {
		
		
		UserDTO newuser = new UserDTO();
		newuser.setUsername("jack");
		
		HttpResponse<Void> response = client.add(newuser);
		
		try { //to check http response outputs.
			FileWriter myWriter = new FileWriter("filename2.txt");
			myWriter.write(addedUsers.get((long)1).toString());
		    myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		
		assertTrue(addedUsers.containsKey((long) 1));
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Creation should be successful");		
		assertEquals(client.list().iterator().next().getId(), (long)1, "Author ID should be 1");		
		assertEquals(client.list().iterator().next().getUsername(), "jack", "Author username should be jack");
		
		UserDTO another = new UserDTO();
		another.setUsername("greg");
		HttpResponse<Void> response2 = client.updateUser(1, another);
		assertEquals(HttpStatus.OK, response2.getStatus(), "Update should be successful");
		
		assertEquals(client.list().iterator().next().getUsername(), "greg", "Author username should be jack");
		
		HttpResponse<Void> response3 = client.deleteUser(1);
		
//		try { //to check http response outputs.
//			FileWriter myWriter = new FileWriter("filename.txt");
//			myWriter.write(response3.getStatus().toString());
//		    myWriter.close();
//		} catch (IOException e) {
//			System.out.println("An error occurred.");
//		    e.printStackTrace();
//		}
		
		assertEquals(response3.getStatus(), HttpStatus.OK, "Delete should be successful");
		
		
	}

}
