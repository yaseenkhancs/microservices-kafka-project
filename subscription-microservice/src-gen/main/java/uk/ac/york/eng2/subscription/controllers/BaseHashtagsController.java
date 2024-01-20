package uk.ac.york.eng2.subscription.controllers;

import uk.ac.york.eng2.subscription.repositories.VideosRepository;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.Set;
import javax.transaction.Transactional;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

public class BaseHashtagsController {
	
	
	VideosRepository videosRepo;	
	
	HashtagsRepository hashtagsRepo;	
	
	UsersRepository usersRepo;	
	
	public Iterable<Hashtag> list(){
	    return null;
	}
	
	public HttpResponse<Void> add(Hashtag var0){
	    return null;
	}
	
	public uk.ac.york.eng2.subscription.dto.HashtagDTO getHashtag(long var0){
	    return null;
	}
	
	public Video[] getHashtagVideos(long var0){
	    return null;
	}
	
	
}