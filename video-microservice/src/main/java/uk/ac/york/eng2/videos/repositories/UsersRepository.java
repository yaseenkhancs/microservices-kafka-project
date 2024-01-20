package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.dto.UserDTO;

/**
 * Repository declaration for the User entity in the Video Microservice 
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Repository
public interface UsersRepository extends BaseUsersRepository {

	Optional<User> findOne(long id);

}
