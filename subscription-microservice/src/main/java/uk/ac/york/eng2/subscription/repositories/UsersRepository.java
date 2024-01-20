package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.User;

@Repository
public interface UsersRepository extends BaseUsersRepository {
	
	Optional<User> findOne(long id);
	
}
