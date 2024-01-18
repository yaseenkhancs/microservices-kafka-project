package uk.ac.york.eng2.videos.controllers;

import uk.ac.york.eng2.videos.repositories.VideosRepository;
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.videos.domain.Video;

public class BaseVideosController {
	
	
	VideosRepository videosRepo;	
	

	public Iterable<Video> list(){
	    return null;
	}
	
	
}