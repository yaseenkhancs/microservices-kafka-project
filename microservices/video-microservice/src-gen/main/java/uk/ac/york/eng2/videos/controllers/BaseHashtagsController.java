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
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;

public class BaseHashtagsController {
	
	
	VideosRepository videosRepo;	
	
	HashtagsRepository hashtagsRepo;	
	
	UsersRepository usersRepo;	
	
	public Iterable<Hashtag> list(){
	    return null;
	}
	
	public HttpResponse<Void> add(uk.ac.york.eng2.videos.dto.HashtagDTO var0){
	    return null;
	}
	
	public uk.ac.york.eng2.videos.dto.HashtagDTO getHashtag(long var0){
	    return null;
	}
	
	public Video[] getHashtagVideos(long var0){
	    return null;
	}
	
	
}