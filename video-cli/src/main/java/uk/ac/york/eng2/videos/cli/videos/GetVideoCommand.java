package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="get-video", description="Gets a specific video", mixinStandardHelpOptions = true)
public class GetVideoCommand implements Runnable {

	@jakarta.inject.Inject
	private VideosClient client;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		VideoDTO video = client.getVideo(id);
		if (video == null) {
			System.err.println("Video not found!");
			System.exit(1);
		} else {
			System.out.print(video);
			System.out.print("[");
			for (User thisuser : client.getWatchers(id)) {
				System.out.print(thisuser.getUsername() + ", ");
			}
			System.out.print("]]");
		}
	}	
}