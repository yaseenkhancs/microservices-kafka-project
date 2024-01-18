package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;

import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.User;

public interface BaseUsersRepository extends CrudRepository<User, Long> {

	Optional<User> findOne(long id);
	
}