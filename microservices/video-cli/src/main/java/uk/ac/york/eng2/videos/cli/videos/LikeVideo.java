package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="like-video", description="likes a video", mixinStandardHelpOptions = true)
public class LikeVideo implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Inject
	private VideosClient client;

	@Override
	public void run() {
		Video videoDetails = new Video();
		Video currentDetails = client.getVideo(id);
		if (currentDetails == null) {
			System.err.println("Video not found!");
			System.exit(1);
		} else {
			videoDetails.setNlikes(currentDetails.getNlikes()+1);
		}
		HttpResponse<Void> response = client.updateVideo(id, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}
}