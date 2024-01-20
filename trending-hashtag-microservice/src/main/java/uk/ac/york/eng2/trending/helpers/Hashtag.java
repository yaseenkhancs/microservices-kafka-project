package uk.ac.york.eng2.trending.helpers;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Helper hashtag class which reflects hashtag in the video domain.
 * Denoted as helper instead of domain, as it is not in its own
 * entity or reflected in the database. Only purpose is to be
 * able to deserialise sent hashtags from the video MS. 
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
