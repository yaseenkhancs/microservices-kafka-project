package uk.ac.york.eng2.videos.controllers;

import uk.ac.york.eng2.videos.repositories.VideosRepository;
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpResponse;

public class BaseVideosController {
	
	
	VideosRepository videosRepo;	
	

	public HttpResponse<Void> getvideos(){
	    return null;
	}
	
	
}