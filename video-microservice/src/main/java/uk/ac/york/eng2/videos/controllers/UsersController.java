package uk.ac.york.eng2.videos.controllers;

import java.net.URI;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.repositories.UsersRepository;

@Controller("/users")
public class UsersController {

	@Inject
	UsersRepository repo;
	
	@Inject
	VideosProducer producer;

	@Get("/")
	public Iterable<User> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body UserDTO userDetails) {
		User user = new User();
		user.setUsername(userDetails.getUsername());
		repo.save(user);
		producer.addUser((long)1, user);
		return HttpResponse.created(URI.create("/users/" + user.getId()));
		
	}

	@Get("/{id}")
	public User getUser(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Transactional
	@Get("/{id}/watchedvideos")
	public Video[] getWatchedVideos(long id) {
		Optional<User> oUser = repo.findById(id);
		if (oUser.isEmpty()) {
			return null;
		}
		return parseSet(oUser.get().getWatchedVideos());
	}
	
	private Video[] parseSet(Set<Video> x) {
		Object[] vidArr = x.toArray();
		Video[] outputArr = Arrays.copyOf(vidArr, vidArr.length, Video[].class);
		return outputArr;
	}

	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		User u = user.get();
		if (userDetails.getUsername() != null) {
			u.setUsername(userDetails.getUsername());
		}
		repo.save(u);
		return HttpResponse.ok();
	}

	@Transactional
	@Delete("/{id}")
	public HttpResponse<Void> deleteUser(long id) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(user.get());
		return HttpResponse.ok();
	}

}
