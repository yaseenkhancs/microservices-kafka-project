package video-microservice.controllers;

import video-microservice.repositories.VideosRepository;
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Get

@Controller("/videos")
public class VideosController {
	
	@Inject	
	VideosRepository videosRepo;	
	
	@Transactional
	@Get("/")
	public HttpResponse<Void> list(){
	}
	
	
}