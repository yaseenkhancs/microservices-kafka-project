package uk.ac.york.eng2.videos.cli.hashtags;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.dto.HashtagDTO;

@Client("${hashtags.url:`http://localhost:8080/hashtags`}")
public interface HashtagsClient {

	@Get("/")
	Iterable<Hashtag> list();

	@Post("/")
	HttpResponse<Void> add(@Body HashtagDTO tagDetails);

	@Get("/{id}")
	HashtagDTO getTag(long id);
}
