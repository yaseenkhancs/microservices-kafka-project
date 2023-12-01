package uk.ac.york.eng2.videos.cli.videos;

import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideosClient {
	
	@Get("/")
	public Iterable<Video> list();

	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails);
	
	@Get("/{id}")
	VideoDTO getVideo(long id);

	@Put("/{id}")
	HttpResponse<Void> updateVideo(long id, @Body VideoDTO videoDetails);
	
	@Delete("/{id}")
	HttpResponse<Void> deleteVideo(long id);

	@Put("/{videoId}/watchers/{videoId}")
	public HttpResponse<String> addWatcher(long videoId, long userId);

	@Get("/{id}/watchers")
	public Iterable<User> getWatchers(long id);
}