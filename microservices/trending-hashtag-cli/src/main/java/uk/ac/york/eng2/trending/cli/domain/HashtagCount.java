package uk.ac.york.eng2.trending.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Class declaration for the HashtagCount which mirrors the same
 * class in the MS 
 * Tagged "Serialisable" so that it can be transferred to the MS
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
 */
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
