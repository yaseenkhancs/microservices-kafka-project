package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.annotation.CrudRepository;

@Repository
public interface VideosRepository extends CrudRepository<Video, Long> {

	Optional<Video> findOne(long id);
	
}