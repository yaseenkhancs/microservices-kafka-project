package uk.ac.york.eng2.subscription.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="add-video-hashtag", description="Adds a hashtag to a video", mixinStandardHelpOptions = true)
public class AddVideoHashtag implements Runnable {
	
	@Inject
	private VideosClient client;
	
	@Parameters(index="0")
	private Long videoId;
	
	@Parameters(index="1")
	private Long hashtagId;

	@Override
	public void run() {
		HttpResponse<String> response = client.addHashtag(videoId, hashtagId);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
	}	

}
