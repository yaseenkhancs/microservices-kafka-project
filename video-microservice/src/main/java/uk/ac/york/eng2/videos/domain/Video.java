package uk.ac.york.eng2.videos.domain;

import java.util.Collection;
import java.util.HashSet;
//import java.util.Set;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.controllers.VideosController;

@Entity
@Serdeable
public class Video extends VideoSrc {

	@Id
	@GeneratedValue
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
	
//	private String tagsString() {
//		String output = "[";
//		for (Hashtag s : tags) {			
//			output = output.concat(s + ", ");
//		}
//		output = output.concat("]");
//		return output;
//	}

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
	
	private String watchersString() {
		if (watchers == null) {
			return "NONE";
		}
		String output = "[";
		for (User s : watchers) {			
			output = output.concat(s.getUsername() + ", ");
		}
		output = output.substring(0,output.length() - 2);
		output = output.concat("]");
		return output;
	}
	
	@Override
	public String toString() {
		return "[title=" + title + ", author=" + author + ", likes="	+ nlikes + 
				", dislikes=" + ndislikes + ", views=" +nviews + ", tags= " + tags + ", watchers: " + watchers + "]";
	}

}
