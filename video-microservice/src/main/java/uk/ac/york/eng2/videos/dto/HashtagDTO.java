package uk.ac.york.eng2.videos.dto;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Data Transfer Object for the Hashtag entity. 
 * Tagged "Serialisable" so that it can be transferred via Kafka
 * 
 * <p>
 * Mirrors uk.ac.york.eng2.videos.domain.Hashtag, no ID field as 
 * this information should be obfuscated in certain cases.
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Serdeable
public class HashtagDTO extends BaseHashtagDTO {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
