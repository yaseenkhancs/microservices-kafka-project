package uk.ac.york.eng2.videos.controllers;

import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.dto.HashtagDTO;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;

@Controller("/hashtags")
public class HashtagsController {
	
	@Inject
	HashtagsRepository repo;
	
	@Get("/")
	public Iterable<Hashtag> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body HashtagDTO tagdetails) {
		Hashtag tag = new Hashtag();
		tag.setName(tagdetails.getName());
		repo.save(tag);
		return HttpResponse.created(URI.create("/hashtags/" + tag.getId()));
	}
	
	@Get("/{id}")
	public HashtagDTO getHashtag(long id) {
		return repo.findOne(id).orElse(null);
	}
	
//	@Get("/{id}/videos")
//	public HashtagDTO getHashtag(long id) {
//		return repo.findOne(id).orElse(null);
//	}
}