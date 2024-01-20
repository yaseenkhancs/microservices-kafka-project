package uk.ac.york.eng2.subscription.controllers;

import uk.ac.york.eng2.subscription.repositories.VideosRepository;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.Set;
import javax.transaction.Transactional;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

public class BaseVideosController {
	
	
	VideosRepository videosRepo;	
	
	HashtagsRepository hashtagsRepo;	
	
	UsersRepository usersRepo;	
	
	public Iterable<Video> list(){
	    return null;
	}
	
	public Video getVideo(long var0){
	    return null;
	}
	
	public HttpResponse<Void> add(uk.ac.york.eng2.subscription.dto.VideoDTO var0){
	    return null;
	}
	
	public HttpResponse<Void> updateVideo(long var0, Video var1){
	    return null;
	}
	
	@Transactional
	public HttpResponse<Void> deleteVideo(long var0){
	    return null;
	}
	
	public Iterable<User> getWatchers(long var0){
	    return null;
	}
	
	public User getVideoAuthor(long var0){
	    return null;
	}
	
	@Transactional
	public Collection<Hashtag> getVideoHashtags(long var0){
	    return null;
	}
	
	public HttpResponse<String> addWatcher(long var0, long var1){
	    return null;
	}
	
	public HttpResponse<String> addHashtag(long var0, long var1){
	    return null;
	}
	
	
}