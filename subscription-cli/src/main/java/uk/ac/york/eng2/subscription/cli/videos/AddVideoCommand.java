package uk.ac.york.eng2.subscription.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Video;

@Command(name="post-video", description="Posts a video", mixinStandardHelpOptions = true)
public class AddVideoCommand implements Runnable {
	
	@Inject
	private VideosClient client;
	
	@Parameters(index="0")
	private Long id;
	
	@Parameters(index="1")
	private String title;

	@Parameters(index="2")
	private Integer nlikes;
	
	@Parameters(index="3")
	private Integer ndislikes;
	
	@Parameters(index="4")
	private Integer nviews;
	
	@Override
	public void run() {
		
		Video video = new Video();
		video.setId(id);
		video.setTitle(title);
		video.setNlikes(nlikes);
		video.setNdislikes(ndislikes);
		video.setNviews(nviews);
		
		HttpResponse<Void> response = client.add(video);
		System.out.println("Server responded with: " + response.getStatus());
		
		
	}
	
}
