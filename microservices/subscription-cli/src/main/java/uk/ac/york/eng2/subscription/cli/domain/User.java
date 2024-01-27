package uk.ac.york.eng2.subscription.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

/**
 * User class which mirrors the same class in the microservice 
 * Serialised to that it can transfer information to the MS
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Serdeable
public class User {

	private Long id;

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

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + "]";
	}	
}
