package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.dto.HashtagDTO;

/**
 * Repository declaration for the User entity in the Subscription MS 
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Repository
public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {
	
	Optional<HashtagDTO> findOne(long id);

}
