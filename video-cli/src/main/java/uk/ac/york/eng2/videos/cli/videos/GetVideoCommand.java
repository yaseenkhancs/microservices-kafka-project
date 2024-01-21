package uk.ac.york.eng2.videos.cli.videos;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="get-video", description="Gets a specific video", mixinStandardHelpOptions = true)
public class GetVideoCommand implements Runnable {

	@jakarta.inject.Inject
	private VideosClient client;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		Video video = client.getVideo(id);
		if (video == null) {
			System.err.println("Video not found!");
			System.exit(1);
		} else {
			System.out.printf("Video %d: %s", video.getId(), video.getTitle());
		}
	}	
}