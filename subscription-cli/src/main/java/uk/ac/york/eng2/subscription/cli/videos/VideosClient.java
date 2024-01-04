package uk.ac.york.eng2.subscription.cli.videos;

import java.util.Collection;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.subscription.cli.domain.Hashtag;
import uk.ac.york.eng2.subscription.cli.domain.User;
import uk.ac.york.eng2.subscription.cli.domain.Video;
import uk.ac.york.eng2.subscription.cli.dto.VideoDTO;

@Client("${videos.url:`http://localhost:8082/videos`}")
public interface VideosClient {
	
	@Get("/")
	public Iterable<Video> list();

	@Post("/")
	public HttpResponse<Void> add(@Body Video videoDetails);
	
	@Get("/{id}")
	Video getVideo(long id);

	@Put("/{id}")
	HttpResponse<Void> updateVideo(long id, @Body Video videoDetails);
	
	@Delete("/{id}")
	HttpResponse<Void> deleteVideo(long id);

	@Put("/{videoId}/watchers/{userId}")
	public HttpResponse<String> addWatcher(long videoId, long userId);
	
	@Put("/{videoId}/hashtags/{hashtagId}")
	public HttpResponse<String> addHashtag(long videoId, long hashtagId);

	@Get("/{id}/watchers")
	public Iterable<User> getWatchers(long id);
	
	@Get("/{id}/author")
	public User getVideoAuthor(long id);
	
	@Get("/{id}/hashtags")
	public Collection<Hashtag> getVideoHashtags(long id);
}
