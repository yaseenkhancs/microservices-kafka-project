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
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

@MicronautTest
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
	}
	
	@Test
	public void noUsers() { 
		Iterable<User> iterUser = client.list();
		assertFalse(iterUser.iterator().hasNext(), "Service should not list any books initially");
	}
	
	@Test
	public void UserTests() {
		
		
		UserDTO newuser = new UserDTO();
		newuser.setUsername("jack");
		
		HttpResponse<Void> response = client.add(newuser);
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Creation should be successful");		
		assertEquals(client.list().iterator().next().getId(), (long)1, "Author ID should be 1");		
		assertEquals(client.list().iterator().next().getUsername(), "jack", "Author username should be jack");
		
		UserDTO another = new UserDTO();
		another.setUsername("jack");		
		client.add(another);
		
		another.setUsername("greg");
		HttpResponse<Void> response2 = client.updateUser(1, another);
		assertEquals(HttpStatus.OK, response2.getStatus(), "Update should be successful");
		
		HttpResponse<Void> response3 = client.deleteUser(1);
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write(response3.getStatus().toString());
		    myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		assertEquals(response3.getStatus(), HttpStatus.OK, "Delete should be successful");
		
		
	}

}
