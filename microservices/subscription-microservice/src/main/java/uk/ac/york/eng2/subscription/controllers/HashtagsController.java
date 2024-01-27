package uk.ac.york.eng2.subscription.controllers;

import java.net.URI;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.HashtagDTO;
import uk.ac.york.eng2.subscription.domain.Hashtag;

/**
 * Controller for the hashtags in subscription MS. Defines the interaction
 * with the database. 
 * <p>
 * Structure and methods of this class are similar to video
 * with the exception that the ID is also explicitly taken
 * in the parameters of methods that create new entity objects. 
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Controller("/hashtags")
public class HashtagsController extends BaseHashtagsController {
	
	@Inject
	HashtagsRepository repo;
	
	@Get("/")
	public Iterable<Hashtag> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body Hashtag tagdetails) {
		Hashtag tag = new Hashtag();
		tag.setId(tagdetails.getId());
		tag.setName(tagdetails.getName());
		repo.save(tag);
		return HttpResponse.created(URI.create("/hashtags/" + tag.getId()));
	}
	
	@Get("/{id}")
	public HashtagDTO getHashtag(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Transactional
	@Get("/{id}/videos")
	public Video[] getHashtagVideos(long id) {
		Optional<Hashtag> oHashtag = repo.findById(id);
		if (oHashtag.isEmpty()) {
			return null;
		}
		return parseSet(oHashtag.get().getTaggedVideos());
	}
	
	private Video[] parseSet(Set<Video> x) {
		Object[] vidArr = x.toArray();
		Video[] outputArr = Arrays.copyOf(vidArr, vidArr.length, Video[].class);
		return outputArr;
	}
}
