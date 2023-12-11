package uk.ac.york.eng2.subscription.controllers;

import java.net.URI;
import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import uk.ac.york.eng2.subscription.repositories.VideosRepository;

@Controller("/videos")
public class VideosController {
	
	@Inject
	VideosRepository repo;

	@Inject
	UsersRepository userRepo;
	
	@Inject
	HashtagsRepository hashtagsRepo;
	
//	@Inject
//	VideosProducer producer;
	
	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body Video videoDetails) {
		Video video = new Video();
		video.setTitle(videoDetails.getTitle());
		video.setAuthor(videoDetails.getAuthor());
		video.setTags(videoDetails.getTags());
		video.setNlikes(0);
		video.setNdislikes(0);
		video.setNviews(0);
		video.setWatchers(null);
		
		repo.save(video);

		return HttpResponse.created(URI.create("/videos/" + video.getId()));
	}
	
	@Get("/{id}")
	public Video getVideo(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Get("/{id}/watchers")
	public Iterable<User> getWatchers(long id) {
		Optional<Video> oVideo = repo.findById(id);
		if (oVideo.isEmpty()) {
			return null;
		}
		return oVideo.get().getWatchers();
	}
	
	@Get("/{id}/author")
	public User getVideoAuthor(long id) {
		Optional<Video> oVideo = repo.findById(id);
		if (oVideo.isEmpty()) {
			return null;
		}
		System.out.println(repo.findOne(id).get().getAuthor());
		return repo.findOne(id).get().getAuthor();
	}
	
	@Transactional
	@Get("/{id}/hashtags")
	public Collection<Hashtag> getVideoHashtags(long id) {
		Optional<Video> oVideo = repo.findById(id);
		if (oVideo.isEmpty()) {
			return null;
		}
		System.out.println(repo.findOne(id).get().getTags());
		return repo.findOne(id).get().getTags();
	}
	
	@Transactional
	@Put("/{videoId}/watchers/{userId}")
	public HttpResponse<String> addWatcher(long videoId, long userId) {
		Optional<Video> oVideo = repo.findById(videoId);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", videoId));
		}

		Optional<User> oUser = userRepo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", userId));
		}

		Video video = oVideo.get();
		video.getWatchers().add(oUser.get());
		repo.update(video);		

		return HttpResponse.ok(String.format("User %d added as watcher of video %d", userId, videoId));
	}
	
	
	@Transactional
	@Put("/{videoId}/hashtags/{hashtagId}")
	public HttpResponse<String> addHashtag(long videoId, long hashtagId) {
		Optional<Video> oVideo = repo.findById(videoId);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", videoId));
		}

		Optional<Hashtag> oHashtag = hashtagsRepo.findById(hashtagId);
		if (oHashtag.isEmpty()) {
			return HttpResponse.notFound(String.format("hashtag %d not found", hashtagId));
		}
		Video video = oVideo.get();
		video.getTags().add(oHashtag.get());
		repo.update(video);
		
		return HttpResponse.ok(String.format("Hashtag %d added as hashtag of video %d", hashtagId, videoId));		
	}
}
