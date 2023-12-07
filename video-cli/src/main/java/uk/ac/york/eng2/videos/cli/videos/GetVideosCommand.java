package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="get-videos", description="Gets all the videos", mixinStandardHelpOptions = true)
public class GetVideosCommand implements Runnable {

	@jakarta.inject.Inject
	private VideosClient client;

	@Override
	public void run() {
		for (Video b : client.list()) {
			System.out.print(b);
			System.out.print("[");
			for (User thisuser : client.getWatchers(b.getId())) {
				System.out.print(thisuser.getUsername() + ", ");
			}
			System.out.print("]]");
		}
	}
}