package video-microservice.controllers;

import video-microservice.repositories.VideosRepository;
import video-microservice.repositories.HashtagsRepository;
import video-microservice.repositories.UsersRepository;
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Get

@Controller("/videos")
public class VideosController {
	
	@Inject	
	VideosRepository videosRepo;	
	@Inject	
	HashtagsRepository hashtagsRepo;	
	@Inject	
	UsersRepository usersRepo;	
	
	@Get("/")
	public HttpResponse getVideo(Video var0){
	}
	
	
}