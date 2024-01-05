package uk.ac.york.eng2.videos.helpers;

import java.util.Collection;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;

@Serdeable
public class HashtagUserPair {

	private Collection<Hashtag> h;
	private User u;
	
	public HashtagUserPair(Collection<Hashtag> h, User u) {
		this.h = h;
		this.u = u;
	}
	
	public Collection<Hashtag> getH() {
		return h;
	}

	public void setH(Collection<Hashtag> h) {
		this.h = h;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}
}
