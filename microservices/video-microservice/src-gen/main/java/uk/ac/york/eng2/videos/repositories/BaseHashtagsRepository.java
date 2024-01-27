package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.Hashtag;

public interface BaseHashtagsRepository extends CrudRepository<Hashtag, Long> {

	Optional<Hashtag> findOne(long id);
	
}