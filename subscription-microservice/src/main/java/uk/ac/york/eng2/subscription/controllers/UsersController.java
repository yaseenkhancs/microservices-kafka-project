package uk.ac.york.eng2.subscription.controllers;

import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import uk.ac.york.eng2.subscription.domain.User;

@Controller("/users")
public class UsersController {
	@Inject
	UsersRepository repo;
	
	@Get("/")
	public Iterable<User> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body User userDetails) {
		User user = new User();
		user.setId(userDetails.getId());
		user.setUsername(userDetails.getUsername());
		repo.save(user);
		return HttpResponse.created(URI.create("/users/" + user.getId()));
	}
}
