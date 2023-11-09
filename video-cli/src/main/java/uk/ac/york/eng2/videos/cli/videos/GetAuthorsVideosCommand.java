package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="get-authors-videos", description="Gets all the videos from an author", mixinStandardHelpOptions = true)
public class GetAuthorsVideosCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String author;
	
	
	@Override
	public void run() {
		for (Video v : client.list()) {
			if (v.getAuthor().equals(author)) {
				System.out.println(v);
			}
		}
	}

}
