package uk.ac.york.eng2.subscription.dto;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Data Transfer Object for the User entity. 
 * Tagged "Serialisable" so that it can be transferred via Kafka
 * 
 * <p>
 * Mirrors uk.ac.york.eng2.subscription.domain.User, no ID field as 
 * this information should be obfuscated in certain cases.
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
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
