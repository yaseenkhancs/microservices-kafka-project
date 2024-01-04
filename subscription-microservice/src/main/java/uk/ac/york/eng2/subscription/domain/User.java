package uk.ac.york.eng2.subscription.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class User {
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String username;
	
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
}
