package uk.ac.york.eng2.trending.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import uk.ac.york.eng2.trending.domain.HashtagCount;

/**
 * Repository declaration for the hashtagcount entity in the trending MS 
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Repository
public interface HashtagCountsRepository extends BaseHashtagCountsRepository{
	
	Optional<HashtagCount> findOne(long id);
	

}
