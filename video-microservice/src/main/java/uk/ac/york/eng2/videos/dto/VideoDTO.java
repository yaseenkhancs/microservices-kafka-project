package uk.ac.york.eng2.videos.dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;

@Serdeable
public class VideoDTO extends BaseVideoDTO {

	private String title;
	private User author;
	private Collection<Hashtag> tags;
	private Integer nlikes;
	private Integer ndislikes;
	private Integer nviews;
	private Set<User> watchers;


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

	private String tagsString() {
		String output = "[";
		for (Hashtag s : tags) {			
			output = output.concat(s + ", ");
		}
		output = output.substring(0,output.length() - 2);
		output = output.concat("]");
		return output;
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
				", dislikes=" + ndislikes + ", views=" +nviews + ", tags= " + tagsString() + ", watchers: " + watchers + "]";
	}

	
	

}
