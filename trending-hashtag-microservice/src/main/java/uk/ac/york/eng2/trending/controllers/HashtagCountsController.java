package uk.ac.york.eng2.trending.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.domain.Hashtag;
import uk.ac.york.eng2.trending.domain.HashtagCounts;
import uk.ac.york.eng2.trending.repositories.HashtagCountsRepository;

@Controller("/hashtagcounts")
public class HashtagCountsController {

	@Inject
	HashtagCountsRepository repo;
	
	@Get("/")
	public Iterable<HashtagCounts> list() {
		return repo.findAll();
	}
}
