package uk.ac.york.eng2.trending.controllers;

import uk.ac.york.eng2.trending.repositories.HashtagCountsRepository;
import jakarta.inject.Inject;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.trending.domain.HashtagCount;

public class BaseHashtagCountsController {
	
	
	HashtagCountsRepository hashtagcountsRepo;	
	
	
}