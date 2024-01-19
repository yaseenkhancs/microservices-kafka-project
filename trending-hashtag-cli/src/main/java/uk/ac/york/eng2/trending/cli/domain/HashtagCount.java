package uk.ac.york.eng2.trending.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagCount {
	private Long id;
	private String name;
	private Long timeStamp;
	
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
	
	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
}
