package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-video", description="Deletes a video", mixinStandardHelpOptions = true)
public class DeleteVideoCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Inject
	private VideosClient client;

	@Override
	public void run() {
		HttpResponse<Void> response = client.deleteVideo(id);
		System.out.println("Server responded with: " + response.getStatus());
	}
}