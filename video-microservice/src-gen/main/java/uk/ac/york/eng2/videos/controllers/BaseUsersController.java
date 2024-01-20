package uk.ac.york.eng2.videos.controllers;

import uk.ac.york.eng2.videos.repositories.VideosRepository;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
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
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.dto.HashtagDTO;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.dto.UserDTO;

public class BaseUsersController {
	
	
	VideosRepository videosRepo;	
	
	HashtagsRepository hashtagsRepo;	
	
	UsersRepository usersRepo;	
	
	public Iterable<User> list(){
	    return null;
	}
	
	public HttpResponse<Void> add(UserDTO var0){
	    return null;
	}
	
	public User getUser(long var0){
	    return null;
	}
	
	public Video[] getWatchedVideos(long var0){
	    return null;
	}
	
	public HttpResponse<Void> updateUser(long var0, UserDTO var1){
	    return null;
	}
	
	public HttpResponse<Void> deleteUser(long var0){
	    return null;
	}
	
	
}