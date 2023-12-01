package uk.ac.york.eng2.videos.cli.domain;

import java.util.HashSet;
import java.util.Set;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.cli.videos.VideosClient;

@Serdeable
public class Video {

	private Long id;
	private String title;
	private String author;
	private HashSet<String> tags;
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
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public HashSet<String> getTags() {
		return tags;
	}
	
	public void setTags(HashSet<String> tags) {
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
	
	private String tagsString() {
		String output = "[";
		for (String s : tags) {			
			output = output.concat(s + ", ");
		}
		output = output.substring(0,output.length() - 2);
		output = output.concat("]");
		return output;
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
		return "[{mainvidcli}title=" + title + ", author=" + author + ", likes="	+ nlikes + 
				", dislikes=" + ndislikes + ", views=" +nviews + ", tags= " + tagsString() + ", watchers: " + watchers + "]";
	}

}
