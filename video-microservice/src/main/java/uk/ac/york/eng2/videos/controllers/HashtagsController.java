package uk.ac.york.eng2.videos.controllers;

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
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.HashtagDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;

@Controller("/hashtags")
public class HashtagsController {
	
	@Inject
	HashtagsRepository repo;
	
	@Inject
	VideosProducer producer;
	
	@Get("/")
	public Iterable<Hashtag> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body HashtagDTO tagdetails) {
		Hashtag tag = new Hashtag();
		tag.setName(tagdetails.getName());
		repo.save(tag);
		producer.addHashtag((long) 1, tag);
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