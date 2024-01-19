package uk.ac.york.eng2.trending.controllers;

import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.helpers.Hashtag;
import uk.ac.york.eng2.trending.domain.HashtagCount;
import uk.ac.york.eng2.trending.repositories.HashtagCountsRepository;

@Controller("/hashtagcounts")
public class HashtagCountsController extends BaseHashtagCountsController {

	@Inject
	HashtagCountsRepository repo;
	
	@Get("/")
	public Iterable<HashtagCount> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body Hashtag tagdetails) {
		HashtagCount tag = new HashtagCount();
		tag.setName(tagdetails.getName());
		tag.setTimeStamp(System.currentTimeMillis());
		repo.save(tag);
		return HttpResponse.created(URI.create("/hashtagcounts/" + tag.getId()));
	}
}
