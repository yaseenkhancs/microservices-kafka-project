package uk.ac.york.eng2.videos.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.helpers.HashtagUserPair;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

/**
 * Controller for the videos microservice. Defines the interaction
 * with the database. 
 * <p>
 * Also encapsulates the kafka producer interaction with the cluster
 * depending various changes to database state. 
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Controller("/videos")
public class VideosController extends BaseVideosController {

	@Inject
	VideosRepository repo;

	@Inject
	UsersRepository userRepo;
	
	@Inject
	HashtagsRepository hashtagsRepo;
	
	@Inject
	VideosProducer producer;

	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}

	/**
	 * Initialises a video with no likes, views, dislikes, or watchers
	 * 
	 * @param videoDetails contains information about a new video, sans ID	 * 
	 */
	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails) {
		Video video = new Video();
		video.setTitle(videoDetails.getTitle());
		video.setAuthor(videoDetails.getAuthor());
		video.setTags(videoDetails.getTags());
		video.setNlikes(0);
		video.setNdislikes(0);
		video.setNviews(0);
		video.setWatchers(null);
		
		repo.save(video);
		
		HashtagUserPair thishup = new HashtagUserPair(videoDetails.getTags(), videoDetails.getAuthor());
		
		producer.postVideo(thishup, video);

		return HttpResponse.created(URI.create("/videos/" + video.getId()));
	}
	
	@Get("/{id}")
	public Video getVideo(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	
	
	/**
	 * updates a video depending on the presence of certain fields in videoDetails
	 */
	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateVideo(long id, @Body Video videoDetails) {
		Optional<Video> video = repo.findById(id);
		if (video.isEmpty()) {
			return HttpResponse.notFound();
		}

		Video v = video.get();
		if (videoDetails.getTitle() != null) {
			v.setTitle(videoDetails.getTitle());
		}
		if (videoDetails.getAuthor() != null) {
			v.setAuthor(videoDetails.getAuthor());
		}
		if (videoDetails.getTags() != null) {
			v.setTags(videoDetails.getTags());
		}
		if (videoDetails.getNviews() != null) {
			v.setNviews(videoDetails.getNviews());	
		}
		if (videoDetails.getNlikes() != null) {
			v.setNlikes(videoDetails.getNlikes());
			ArrayList<Hashtag> newlist = new ArrayList<>(getVideoHashtags(id));			
			for (Hashtag thistag : newlist) {
				producer.likeVideo((long) 1, thistag);
			}
		}
		if (videoDetails.getNdislikes() != null) {
			v.setNdislikes(videoDetails.getNdislikes());
			producer.dislikeVideo(id, v);
		}
		repo.update(v);
		return HttpResponse.ok();
	}

	@Transactional
	@Delete("/{id}")
	public HttpResponse<Void> deleteVideo(long id) {
		Optional<Video> video = repo.findById(id);
		if (video.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(video.get());
		return HttpResponse.ok();
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
		video.setNviews(video.getNviews()+1);
		repo.update(video);
		
		producer.addWatcher(videoId, userId);

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
		Hashtag x = oHashtag.get();
		System.out.println(x.getId());
		System.out.println(x.getName());
		System.out.println(x.getTaggedVideos());
		System.out.println(video.getId());
		video.getTags().add(oHashtag.get());
		repo.update(video);
		
		producer.addAnotherHashtag(videoId, hashtagId);
		
		return HttpResponse.ok(String.format("Hashtag %d added as hashtag of video %d", hashtagId, videoId));		
	}

}
