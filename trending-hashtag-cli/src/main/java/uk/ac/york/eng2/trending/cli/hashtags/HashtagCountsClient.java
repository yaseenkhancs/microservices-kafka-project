package uk.ac.york.eng2.trending.cli.hashtags;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.trending.cli.domain.HashtagCount;

@Client("${hashtagcounts.url:`http://localhost:8081/hashtagcounts`}")
public interface HashtagCountsClient {
	@Get("/")
	Iterable<HashtagCount> list();
}
