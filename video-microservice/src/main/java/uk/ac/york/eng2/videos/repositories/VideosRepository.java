package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import javax.validation.constraints.NotNull;


import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.Video;
//import uk.ac.york.eng2.books.domain.Book;
//import uk.ac.york.eng2.books.dto.BookDTO;

@Repository
public interface VideosRepository extends CrudRepository<Video, Long> {

	//@Join(value = "tags", type = Join.Type.LEFT_FETCH)
	@Join(value = "watchers", type = Join.Type.LEFT_FETCH)
	@Join(value = "author", type = Join.Type.LEFT_FETCH)
	@Override
	Optional<Video> findById(@NotNull Long id);
	
//	Optional<Video> findByIdHash(@NotNull Long id);

	Optional<Video> findOne(long id);
	
	@Query("FROM Video v WHERE v.tags = :thistag ORDER BY v.title")
	Optional<Video> findByHashtag(Hashtag thistag);

}
