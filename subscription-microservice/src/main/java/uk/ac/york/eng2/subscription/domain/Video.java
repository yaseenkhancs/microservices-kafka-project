package uk.ac.york.eng2.subscription.domain;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Entity declaration for the Video in the subscription MS 
 * Tagged "Serialisable" so that it can be transferred via Kafka
 * 
 * <p>
 * Contains an ID field that is auto-generated, for the database. 
 * Title, likes, dislikes and views are basic fields
 * The hashtags it uses are contained in a collection, and also
 * in a Many To Many relationship, likewise with the set of users
 * that have watched this video. 
 * Author is stored in a many to one relationship.
 * 
 * Note - ID in this case is NOT autogenerated, because it is
 * explicitly given when creating the entities in the database
 * to ensure that the entities have the same IDs of the same entity
 * in the video microservice.
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Entity
@Serdeable
public class Video extends BaseVideo {
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
//	@ElementCollection
	@JsonIgnore
	@ManyToMany
	private Collection<Hashtag> tags;
	
	@Column(nullable = false)
	private Integer nlikes;
	
	@Column(nullable = false)
	private Integer ndislikes;
	
	@Column(nullable = false)
	private Integer nviews;

	@JsonIgnore
	@ManyToMany
	private Set<User> watchers;
	
	@JsonIgnore
	@ManyToOne
	private User author;
	
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
