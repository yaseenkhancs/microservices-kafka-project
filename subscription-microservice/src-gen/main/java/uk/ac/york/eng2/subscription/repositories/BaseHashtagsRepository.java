package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;

import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.Hashtag;

public interface BaseHashtagsRepository extends CrudRepository<Hashtag, Long> {

	Optional<Hashtag> findOne(long id);
	
}