package uk.ac.york.eng2.subscription.controllers;

import java.net.URI;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.UserDTO;
import uk.ac.york.eng2.subscription.events.VideosProducer;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

@Controller("/users")
public class UsersController extends BaseUsersController {
	
	@Inject
	UsersRepository repo;
	
	@Inject
	HashtagsRepository hashtagrepo;
	
	@Inject
	VideosProducer vproducer;
	
	@Get("/")
	public Iterable<User> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body User userDetails) {
		User user = new User();
		user.setId(userDetails.getId());
		user.setUsername(userDetails.getUsername());
		repo.save(user);
		return HttpResponse.created(URI.create("/users/" + user.getId()));
	}
	
	@Get("/{id}")
	public User getUser(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Transactional
	@Get("/{id}/watchedvideos")
	public Video[] getWatchedVideos(long id) {
		Optional<User> oUser = repo.findById(id);
		if (oUser.isEmpty()) {
			return null;
		}
		return parseSet(oUser.get().getWatchedVideos());
	}
	
	private Video[] parseSet(Set<Video> x) {
		Object[] vidArr = x.toArray();
		Video[] outputArr = Arrays.copyOf(vidArr, vidArr.length, Video[].class);
		return outputArr;
	}

	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		User u = user.get();
		if (userDetails.getUsername() != null) {
			u.setUsername(userDetails.getUsername());
		}
		repo.save(u);
		return HttpResponse.ok();
	}

	@Transactional
	@Delete("/{id}")
	public HttpResponse<Void> deleteUser(long id) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(user.get());
		return HttpResponse.ok();
	}
	
	@Transactional
	@Get("/{id}/subscribedhashtags")
	public Hashtag[] getSubscribedHashtags(long id) {
		Optional<User> oUser = repo.findById(id);
		if (oUser.isEmpty()) {
			return null;
		}
		return parseHashtags(oUser.get().getSubscribedHashtags());
	}
	
	public Hashtag[] parseHashtags(Set<Hashtag> x) {
		Object[] y = x.toArray();
		Hashtag[] outputArr = Arrays.copyOf(y, y.length, Hashtag[].class);
		return outputArr;
		
	}
	
	@Transactional
	@Put("/{userId}/subscribedhashtags/{hashtagId}")
	public HttpResponse<String> addSubHashtag(long userId, long hashtagId) {
		Optional<User> oUser = repo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", userId));
		}

		Optional<Hashtag> oHashtag = hashtagrepo.findById(hashtagId);
		if (oHashtag.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", hashtagId));
		}

		User user = oUser.get();
		user.getSubscribedHashtags().add(oHashtag.get());
		repo.update(user);
		
		vproducer.subscribed(userId, hashtagId);

		return HttpResponse.ok(String.format("hashtag %d added as subbed tag of user %d", hashtagId, userId));
	}
	
	@Transactional
	@Put("/{userId}/subscribedhashtags/{hashtagId}/delete")
	public HttpResponse<String> deleteSubHashtag(long userId, long hashtagId) {
		Optional<User> oUser = repo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", userId));
		}

		Optional<Hashtag> oHashtag = hashtagrepo.findById(hashtagId);
		if (oHashtag.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", hashtagId));
		}

		User user = oUser.get();
		
		user.getSubscribedHashtags().remove(oHashtag.get());
		
		repo.update(user);		
		
		vproducer.unsubscribed(userId, hashtagId);

		return HttpResponse.ok(String.format("hashtag %d removed as subbed tag of user %d", hashtagId, userId));
	}
	
	@Transactional
	@Get("/{userId}/subscribedhashtags/{hashtagId}/videos")
	public Video[] getUserTagVideos(long userId, long hashtagId) {
		Optional<User> oUser = repo.findById(userId);
		if (oUser.isEmpty()) {
			return null;
		}

		Optional<Hashtag> oHashtag = hashtagrepo.findById(hashtagId);
		if (oHashtag.isEmpty()) {
			return null;
		}
		
		return parseSet(oHashtag.get().getTaggedVideos());
	}
	
	
	
}
