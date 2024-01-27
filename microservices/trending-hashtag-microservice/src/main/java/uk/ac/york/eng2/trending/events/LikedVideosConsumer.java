package uk.ac.york.eng2.trending.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.controllers.HashtagCountsController;
import uk.ac.york.eng2.trending.helpers.Hashtag;

/**
 * Kafka client for consuming events in the trending MS 
 * <p>
 * This single class handles all of the consumption, namely the 
 * consuming of liked videos.
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@KafkaListener(groupId = "trending-group")
public class LikedVideosConsumer extends BaseTrendingConsumer {	
	
	@Inject
	HashtagCountsController control;
			
	/**
	 * Extracts the hashtag from the event and utilises the 
	 * hashtagcountscontroller to post this to the database.
	 */
	@Topic("video-liked")
	public void videoLikeMetric(@KafkaKey long v, Hashtag h) {
		System.out.println("Haha");
		control.add(h);
	}
}
