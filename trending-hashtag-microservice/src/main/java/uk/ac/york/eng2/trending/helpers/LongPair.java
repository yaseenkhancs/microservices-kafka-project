package uk.ac.york.eng2.trending.helpers;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class LongPair {
	
	private Long first;
	private Long second;
	
	public LongPair(Long first, Long second) {
		this.first = first;
		this.second = second;
	}
	
	public void setFirst(Long first) {
		this.first = first;
	}
	
	public Long getFirst() {
		return first;
	}
	
	public void setSecond(Long second) {
		this.second = second;
	}
	
	public Long getSecond() {
		return second;
	}

}
