package uk.ac.york.eng2.trending;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.trending.domain.Hashtag;

@Client("/hashtags")
public interface HashtagsClient {
	@Get("/")
	Iterable<Hashtag> list();
	
	@Post("/")
	HttpResponse<Void> add(@Body Hashtag tagDetails);

	@Get("/{id}")
	Hashtag getTag(long id);
}
