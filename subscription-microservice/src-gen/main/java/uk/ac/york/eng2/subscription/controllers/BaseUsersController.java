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
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

public class BaseUsersController {
	
	
	VideosRepository videosRepo;	
	
	HashtagsRepository hashtagsRepo;	
	
	UsersRepository usersRepo;	
	
	public Iterable<User> list(){
	    return null;
	}
	
	public HttpResponse<Void> add(User var0){
	    return null;
	}
	
	public User getUser(long var0){
	    return null;
	}
	
	public Video[] getWatchedVideos(long var0){
	    return null;
	}
	
	public HttpResponse<Void> updateUser(long var0, uk.ac.york.eng2.subscription.dto.UserDTO var1){
	    return null;
	}
	
	public HttpResponse<Void> deleteUser(long var0){
	    return null;
	}
	
	public Hashtag[] getSubscribedHashtags(long var0){
	    return null;
	}
	
	public HttpResponse<String> addSubHashtag(long var0, long var1){
	    return null;
	}
	
	public HttpResponse<String> deleteSubHashtag(long var0, long var1){
	    return null;
	}
	
	public Video[] getUserTagVideos(long var0, long var1){
	    return null;
	}
	
	
}