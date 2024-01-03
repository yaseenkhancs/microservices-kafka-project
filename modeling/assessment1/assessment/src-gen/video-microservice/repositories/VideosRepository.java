package video-microservice.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.annotation.CrudRepository;

@Repository
public interface VideosRepository extends CrudRepository<Video, Long> {
	
}