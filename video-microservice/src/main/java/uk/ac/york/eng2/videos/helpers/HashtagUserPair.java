package uk.ac.york.eng2.videos.helpers;

import java.util.Collection;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;

/**
 * Helper class for transferring hashtag and user information in
 * the same kafka event
 * <p>
 * Due to Kafka potentially processing records out of order, transferring
 * Hashtag and User information in separate events is a potential risk, so
 * all of this information is sent out in a single object when a video is 
 * posted so that it can be consumed by the subscription microservice.
 * 
 * Additionally:
 * micronaut.configuration.kafka.serde.SerdeRegeistry is also unable to 
 * serialise parameterized types, such as Pair<A, B>, so a custom
 * class is required for serialisation. * 
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
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
