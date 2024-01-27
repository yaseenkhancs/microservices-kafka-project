package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;

import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.Video;

public interface BaseVideosRepository extends CrudRepository<Video, Long> {

	Optional<Video> findOne(long id);
	
}