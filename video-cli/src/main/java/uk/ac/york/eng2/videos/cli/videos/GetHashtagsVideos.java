package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.hashtags.HashtagsClient;

@Command(name="get-hashtags-videos", description="Gets all the videos from a hashtag", mixinStandardHelpOptions = true)
public class GetHashtagsVideos implements Runnable  {
	
	@Inject
	private VideosClient client;
	
	@Inject
	private HashtagsClient hclient;
	
	@Parameters(index="0")
	private Long hashtagId;

	@Override
	public void run() {
		for (Video v : client.list()) {
			for (Hashtag h : client.getVideoHashtags(v.getId())) {
				if (h.getId() == hashtagId) {
					System.out.printf("Video %d: %s\n", v.getId(), v.getTitle());
				}
			}
		}		
	}
	
	

}
