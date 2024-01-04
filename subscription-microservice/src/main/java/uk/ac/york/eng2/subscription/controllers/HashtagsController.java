package uk.ac.york.eng2.subscription.controllers;

import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.domain.Hashtag;

@Controller("/hashtags")
public class HashtagsController {
	
	@Inject
	HashtagsRepository repo;
	
	@Get("/")
	public Iterable<Hashtag> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body Hashtag tagdetails) {
		Hashtag tag = new Hashtag();
		tag.setId(tagdetails.getId());
		tag.setName(tagdetails.getName());
		repo.save(tag);
		return HttpResponse.created(URI.create("/hashtags/" + tag.getId()));
	}
}
