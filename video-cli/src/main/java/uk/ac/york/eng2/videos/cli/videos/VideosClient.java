package uk.ac.york.eng2.videos.cli.videos;

import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideosClient {
	
	@Get("/")
	public Iterable<Video> list();

	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO bookDetails);
	
	@Get("/{id}")
	VideoDTO getVideo(long id);

}
