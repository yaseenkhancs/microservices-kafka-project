package video-microservice.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.annotation.CrudRepository;

@Repository
public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {

	Optional<Hashtag> findOne(long id);
	
}