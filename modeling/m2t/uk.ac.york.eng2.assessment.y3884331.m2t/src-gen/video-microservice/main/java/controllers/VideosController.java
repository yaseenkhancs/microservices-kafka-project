package uk.ac.york.eng2.videos.controllers;

import video-microservice.repositories.VideosRepository;
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Get

@Controller("/videos")
public class VideosController {
	
	@Inject	
	VideosRepository videosRepo;	
	
	@Get("/")
	public HttpResponse<Void> get-videos(){
	}
	
	
}