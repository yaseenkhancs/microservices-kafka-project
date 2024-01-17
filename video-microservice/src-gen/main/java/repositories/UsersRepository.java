package myassessment.videomicroservice.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.annotation.CrudRepository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {

	Optional<User> findOne(long id);
	
}