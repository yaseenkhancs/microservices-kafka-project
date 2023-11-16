package uk.ac.york.eng2.trending.domain;

import java.util.HashSet;
//import java.util.Set;
//import javax.persistence.ManyToMany;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Video {
	private Long id;
	private String title;
	private String author;
	private HashSet<String> tags;
	private Integer nlikes;
	private Integer ndislikes;
	private Integer nviews;

//	@JsonIgnore
//	@ManyToMany
//	private Set<User> readers;

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
	
	private String tagsString() {
		String output = "[";
		for (String s : tags) {			
			output = output.concat(s + ", ");
		}
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
	
	@Override
	public String toString() {
		return "[title=" + title + ", author=" + author + ", likes="	+ nlikes + 
				", dislikes=" + ndislikes + ", views=" +nviews + ", tags= " + tagsString() + "]";
	}

//	public Set<User> getReaders() {
//		return readers;
//	}

//	public void setReaders(Set<User> readers) {
//		this.readers = readers;
//	}

}
