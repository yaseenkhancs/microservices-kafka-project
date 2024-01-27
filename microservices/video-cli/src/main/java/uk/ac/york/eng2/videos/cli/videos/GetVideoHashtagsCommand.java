package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;

@Command(name="get-video-hashtags", description="Gets the hashtags of a specific video", mixinStandardHelpOptions = true)
public class GetVideoHashtagsCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Parameters(index="0")
	private Long id;
	
	@Override
	public void run() {
		for (Hashtag h : client.getVideoHashtags(id)) {
			System.out.printf("Video %d: %s\n", h.getId(), h.getName());
		}
	}
}

