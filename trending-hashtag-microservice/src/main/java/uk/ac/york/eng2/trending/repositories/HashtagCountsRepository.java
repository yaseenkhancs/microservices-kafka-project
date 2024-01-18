package uk.ac.york.eng2.trending.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.trending.domain.HashtagCount;

@Repository
public interface HashtagCountsRepository extends CrudRepository<HashtagCount, Long>{
	
	Optional<HashtagCount> findOne(long id);
	

}
