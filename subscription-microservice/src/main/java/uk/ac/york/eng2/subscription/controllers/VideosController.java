package uk.ac.york.eng2.subscription.controllers;

import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.repositories.VideosRepository;
import uk.ac.york.eng2.subscription.domain.Video;

@Controller("/videos")
public class VideosController {
	
	@Inject
	VideosRepository repo;
	
	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body Video videoDetails) {
		Video video = new Video();
		video.setId(videoDetails.getId());
		video.setTitle(videoDetails.getTitle());
		
		repo.save(video);		

		return HttpResponse.created(URI.create("/videos/" + video.getId()));
	}
}
