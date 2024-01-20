package uk.ac.york.eng2.subscription.dto;

import java.util.Collection;
import java.util.Set;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

/**
 * Data Transfer Object for the Video entity. 
 * Tagged "Serialisable" so that it can be transferred via Kafka
 *
 * <p>
 * Mirrors uk.ac.york.eng2.subscription.domain.Video, no ID field as 
 * this information should be obfuscated in certain cases.
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Serdeable
public class VideoDTO extends BaseVideoDTO {
	
	private Long id;
	private String title;
	private User author;
	private Collection<Hashtag> tags;
	private Integer nlikes;
	private Integer ndislikes;
	private Integer nviews;
	private Set<User> watchers;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
	
	public Collection<Hashtag> getTags() {
		return tags;
	}
	
	public void setTags(Collection<Hashtag> tags) {
		this.tags = tags;
	}
	
	public Integer getNlikes() {
		return nlikes;
	}

	public void setNlikes(Integer nlikes) {
		this.nlikes = nlikes;
	}
	
	public Integer getNdislikes() {
		return ndislikes;
	}

	public void setNdislikes(Integer ndislikes) {
		this.ndislikes = ndislikes;
	}
	
	public Integer getNviews() {
		return nviews;
	}

	public void setNviews(Integer nviews) {
		this.nviews = nviews;
	}

	public Set<User> getWatchers() {
		return watchers;
	}

	public void setWatchers(Set<User> watchers) {
		this.watchers = watchers;
	}
	
}
