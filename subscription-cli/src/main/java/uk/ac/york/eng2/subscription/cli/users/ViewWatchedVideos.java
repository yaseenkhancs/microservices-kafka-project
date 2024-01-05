package uk.ac.york.eng2.subscription.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Video;

@Command(name="view-watched-videos", description="views the watched videos for a user", mixinStandardHelpOptions = true)
public class ViewWatchedVideos implements Runnable {
	
	@Inject
	UsersClient client;
	
	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		Video[] importedArray = client.getWatchedVideos(id);
		for (int i = 0; i < importedArray.length; i++) {
			System.out.println(importedArray[i].getTitle());
		}
	}

}
