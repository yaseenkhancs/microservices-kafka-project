package uk.ac.york.eng2.videos.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class Hashtag extends BaseHashtag {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "tags")
	private Set<Video> taggedVideos;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Video> getTaggedVideos() {
		return taggedVideos;
	}
	
	public void setTaggedVideos(Set<Video> taggedVideos) {
		this.taggedVideos = taggedVideos;
	}
	
}