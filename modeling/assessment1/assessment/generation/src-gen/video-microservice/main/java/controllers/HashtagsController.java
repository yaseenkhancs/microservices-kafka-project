package video-microservice.controllers;

import video-microservice.repositories.VideosRepository;
import video-microservice.repositories.HashtagsRepository;
import video-microservice.repositories.UsersRepository;
import jakarta.inject.Inject;

@Controller("/hashtags")
public class HashtagsController {
	
	@Inject	
	VideosRepository videosRepo;	
	@Inject	
	HashtagsRepository hashtagsRepo;	
	@Inject	
	UsersRepository usersRepo;	
	
	
}