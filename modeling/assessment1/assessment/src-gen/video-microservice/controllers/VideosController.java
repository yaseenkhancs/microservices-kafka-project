package video-microservice.controllers;

import video-microservice.repositories.VideosRepository;
import jakarta.inject.Inject;

@Controller("/videos")
public class VideosController {
	
	@Inject	
	VideosRepository videosRepo;	
	
	
}