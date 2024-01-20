package uk.ac.york.eng2.subscription.dto;

import io.micronaut.serde.annotation.Serdeable;

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
