package uk.ac.york.eng2.subscription.cli.users;

import java.util.ArrayList;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Video;

@Command(name="view-subscription-videos", description="enter user and hashtag, will output next 10 videos to watch", mixinStandardHelpOptions = true)
public class ViewUserSubscriptionVideos implements Runnable {
	
	@Inject
	UsersClient client;
	
	@Parameters(index="0")
	private Long userId;
	
	@Parameters(index="1")
	private Long hashtagId;

	@Override
	public void run() {
		Video[] imported = client.getUserTagVideos(userId, hashtagId);
		Video[] watched = client.getWatchedVideos(userId);
		
		ArrayList<Long> watchedIds = new ArrayList<Long>();
		
		for (int i = 0; i < watched.length; i++) {
			watchedIds.add(watched[i].getId());
		}
		
		for (int i = 0; i < imported.length; i++) {
			if (watchedIds.contains(imported[i].getId())) {
				continue;
			}			
			System.out.println(imported[i].getTitle());
		}
		
	}

}
