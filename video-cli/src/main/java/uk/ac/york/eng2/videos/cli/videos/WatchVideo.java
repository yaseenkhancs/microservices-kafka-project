package uk.ac.york.eng2.videos.cli.videos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="watch-video", description="watches a video", mixinStandardHelpOptions = true)
public class WatchVideo implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Inject
	private VideosClient client;

	@Override
	public void run() {
		VideoDTO videoDetails = new VideoDTO();
		VideoDTO currentDetails = client.getVideo(id);
		if (currentDetails == null) {
			System.err.println("Video not found!");
			System.exit(1);
		} else {
			videoDetails.setNviews(currentDetails.getNviews()+1);
		}
		System.out.println(videoDetails.getNviews());
		HttpResponse<Void> response = client.updateBook(id, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}
