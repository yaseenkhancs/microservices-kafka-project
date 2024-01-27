package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import uk.ac.york.eng2.subscription.domain.User;

/**
 * Repository declaration for the User entity in the Subscription MS 
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Repository
public interface UsersRepository extends BaseUsersRepository {
	
	Optional<User> findOne(long id);
	
}
