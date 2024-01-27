package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.User;

public interface BaseUsersRepository extends CrudRepository<User, Long> {

	Optional<User> findOne(long id);
	
}