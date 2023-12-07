package uk.ac.york.eng2.videos.cli.videos;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.User;

@Command(name="get-video-author", description="gets the author of a video", mixinStandardHelpOptions=true)
public class GetVideoAuthor implements Runnable {
	
	@jakarta.inject.Inject
	private VideosClient client;

	@Parameters(index="0")
	private Long id;
	
	@Override
	public void run() {
		User usr = client.getVideoAuthor(id);
		System.out.println(usr);
	}

}
