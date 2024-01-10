package uk.ac.york.eng2.subscription;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.dto.HashtagDTO;
import uk.ac.york.eng2.subscription.domain.Video;

@Client("/hashtags")
public interface HashtagsClient {
	
	@Get("/")
	Iterable<Hashtag> list();

	@Post("/")
	HttpResponse<Void> add(@Body Hashtag tagDetails);

	@Get("/{id}")
	HashtagDTO getTag(long id);
	
	@Get("/{id}/videos")
	Video[] getHashtagVideos(long id);
}
