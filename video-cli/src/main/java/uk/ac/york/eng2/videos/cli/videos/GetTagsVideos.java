package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="get-tags-videos", description="Gets all the videos from a tag", mixinStandardHelpOptions = true)
public class GetTagsVideos implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String tag;
	
	@Override
	public void run() {
		for (Video v : client.list()) {
			if (v.getTags().contains(tag)) {
				System.out.println(v);
			}
		}
	}

}