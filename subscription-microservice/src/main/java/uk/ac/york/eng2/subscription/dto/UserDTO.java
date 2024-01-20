package uk.ac.york.eng2.subscription.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class UserDTO extends BaseUserDTO {
	
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
