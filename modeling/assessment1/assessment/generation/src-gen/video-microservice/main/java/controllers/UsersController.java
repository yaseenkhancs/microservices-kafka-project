package myassessment.videomicroservice.controllers;

import video-microservice.repositories.VideosRepository;
import video-microservice.repositories.HashtagsRepository;
import video-microservice.repositories.UsersRepository;
import jakarta.inject.Inject;

@Controller("/users")
public class UsersController {
	
	@Inject	
	VideosRepository videosRepo;	
	@Inject	
	HashtagsRepository hashtagsRepo;	
	@Inject	
	UsersRepository usersRepo;	
	
	
}