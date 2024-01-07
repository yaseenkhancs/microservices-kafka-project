package lol.controllers;

import lol.repositories.VideosRepository;
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Get

@Controller("/videos")
public class VideosController {
	
	@Inject	
	VideosRepository videosRepo;	
	
	@Transactional
	@Get("/")
	public Integer GetAllVideos(Video var0, Long var1){
	}
	
	
}