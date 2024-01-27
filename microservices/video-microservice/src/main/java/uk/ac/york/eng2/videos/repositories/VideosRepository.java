package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import javax.validation.constraints.NotNull;


import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.Video;
//import uk.ac.york.eng2.books.domain.Book;
//import uk.ac.york.eng2.books.dto.BookDTO;

/**
 * Repository declaration for the Video entity in the Video Microservice 
 * <p>
 * Creates several database joins to represent various relationships.
 * 
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Repository
public interface VideosRepository extends BaseVideosRepository {

	@Join(value = "watchers", type = Join.Type.LEFT_FETCH)
	@Join(value = "author", type = Join.Type.LEFT_FETCH)
	@Override
	Optional<Video> findById(@NotNull Long id);
	
	Optional<Video> findOne(long id);
	
	@Query("FROM Video v WHERE v.tags = :thistag ORDER BY v.title")
	Optional<Video> findByHashtag(Hashtag thistag);

}
