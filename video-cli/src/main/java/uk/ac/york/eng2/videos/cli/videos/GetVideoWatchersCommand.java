package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.User;

@Command(name="get-video-watchers", description="Gets the watchers of a specific video", mixinStandardHelpOptions = true)
public class GetVideoWatchersCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		for (User user : client.getWatchers(id)) {
			System.out.printf("User %d: %s\n", user.getId(), user.getUsername());
		}
	}
	
}
