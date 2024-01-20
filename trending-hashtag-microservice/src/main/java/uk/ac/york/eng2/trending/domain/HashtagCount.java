package uk.ac.york.eng2.trending.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.micronaut.serde.annotation.Serdeable;

/**
 * Entity declaration for the HashtagCount in the trending MS 
 * Tagged "Serialisable" so that it can be transferred via Kafka
 * 
 * 
 * ID is auto-generated so it can be appropriately saved in its
 * own database. name reflects the hashtags name and the 
 * timestamp reflects the time at which it is stored
 * 
 * @author Y3884331
 * @version 0.1
 * @since 0.1
 */
@Entity
@Serdeable
public class HashtagCount extends BaseHashtagCount {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
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
