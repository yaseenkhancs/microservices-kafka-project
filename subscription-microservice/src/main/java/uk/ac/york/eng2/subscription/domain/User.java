package uk.ac.york.eng2.subscription.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class User extends BaseUser {
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String username;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "watchers")
	private Set<Video> watchedVideos;
	
	@JsonIgnore
	@OneToMany
	private Set<Hashtag> subscribedHashtags;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public Set<Video> getWatchedVideos() {
		return watchedVideos;
	}

	public void setWatchedVideos(Set<Video> watchedVideos) {
		this.watchedVideos = watchedVideos;
	}
	
	public Set<Hashtag> getSubscribedHashtags() {
		return subscribedHashtags;
	}
	
	public void setSubscribedHashtags(Set<Hashtag> subscribedHashtags) {
		this.subscribedHashtags = subscribedHashtags;
	}
}
