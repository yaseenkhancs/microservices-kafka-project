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

/**
 * Entity declaration for the User in the video Microservice 
 * Tagged "Serialisable" so that it can be transferred via Kafka
 * 
 * 
 * ID is auto-generated so it can be appropriately saved in its
 * own database. Username is a simple string and the set of watched
 * videos is stored in a many to many relationship.
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
 */
@Entity
@Serdeable
public class User extends BaseUser {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String username;

	@JsonIgnore
	@ManyToMany(mappedBy = "watchers")
	private Set<Video> watchedVideos;

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
}