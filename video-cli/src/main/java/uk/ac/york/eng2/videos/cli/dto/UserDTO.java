package uk.ac.york.eng2.videos.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

/**
 * User data transfer object class which mirrors the same 
 * class in the microservice. 
 * Serialised to that it can transfer information to the MS
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Serdeable
public class UserDTO {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + "]";
	}

}
