package uk.ac.york.eng2.videos.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Hashtag class which mirrors the same class in the microservice 
 * Serialised to that it can transfer information to the MS
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Serdeable
public class Hashtag {
	private Long id;
	private String name;
	
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
}