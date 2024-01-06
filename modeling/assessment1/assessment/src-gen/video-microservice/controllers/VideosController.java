package video-microservice.controllers;

import video-microservice.repositories.VideosRepository;
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Get

@Controller("/videos")
public class VideosController {
	
	@Inject	
	VideosRepository videosRepo;	
	
	@Transactional
	@Lol
	@Mate
	@Get("/hellothere")
	public d getdat(){
	}
	
	
}