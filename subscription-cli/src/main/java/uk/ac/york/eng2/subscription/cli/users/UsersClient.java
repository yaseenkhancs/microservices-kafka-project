package uk.ac.york.eng2.subscription.cli.users;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.subscription.cli.domain.User;
import uk.ac.york.eng2.subscription.cli.dto.UserDTO;

@Client("${users.url:`http://localhost:8082/users`}")
public interface UsersClient {
	
	@Get("/")
	Iterable<User> list();

	@Post("/")
	HttpResponse<Void> add(@Body User userDetails);

	@Get("/{id}")
	User getUser(long id);

	@Put("/{id}")
	HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails);

	@Delete("/{id}")
	HttpResponse<Void> deleteUser(long id);

}
