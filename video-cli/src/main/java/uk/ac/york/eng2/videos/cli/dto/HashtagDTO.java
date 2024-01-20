package uk.ac.york.eng2.videos.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Hashtag data transfer object class which mirrors the same 
 * class in the microservice. 
 * Serialised to that it can transfer information to the MS
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Serdeable
public class HashtagDTO {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
