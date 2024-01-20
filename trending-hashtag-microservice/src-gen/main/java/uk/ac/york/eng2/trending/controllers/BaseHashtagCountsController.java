package uk.ac.york.eng2.trending.controllers;

import uk.ac.york.eng2.trending.repositories.HashtagCountsRepository;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.Set;
import javax.transaction.Transactional;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.trending.domain.HashtagCount;

public class BaseHashtagCountsController {
	
	
	HashtagCountsRepository hashtagcountsRepo;	
	
	public Iterable<HashtagCount> list(){
	    return null;
	}
	
	public HttpResponse<Void> add(uk.ac.york.eng2.trending.helpers.Hashtag var0){
	    return null;
	}
	
	
}