package uk.ac.york.eng2.subscription.cli.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

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
		
		List<Video> sortedWatchedList = Arrays.asList(watched);
		
		Collections.sort(sortedWatchedList, new Comparator<Video>(){
			@Override
			public int compare(Video o1, Video o2) {
				return o1.getNviews() < o2.getNviews() ? -1
					 : o1.getNviews() < o2.getNviews() ? 1
					 : 0;
			}			
		});
		
		ArrayList<Long> ids = new ArrayList<Long>();
		for (Video x : sortedWatchedList) {
			ids.add(x.getId());
		}
		
		int x = imported.length;
		
		for (Video v : imported) {
			if (x < 0) {
				break;
			}
			if (ids.contains(v.getId())) {
				continue;
			}
			System.out.printf("Video %d: %s", v.getId(), v.getTitle());
			x--;
		}
		
	}

}
