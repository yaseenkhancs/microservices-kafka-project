package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.Video;
//import uk.ac.york.eng2.books.domain.Book;
//import uk.ac.york.eng2.books.dto.BookDTO;
import uk.ac.york.eng2.videos.dto.VideoDTO;

@Repository
public interface VideosRepository extends CrudRepository<Video, Long> {

//	@Join(value = "readers", type = Join.Type.LEFT_FETCH)
//	@Override
//	Optional<Book> findById(@NotNull Long id);
//
	Optional<VideoDTO> findOne(long id);

}
