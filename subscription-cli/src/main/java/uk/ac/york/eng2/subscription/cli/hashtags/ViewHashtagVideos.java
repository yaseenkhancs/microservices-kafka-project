package uk.ac.york.eng2.subscription.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Video;

@Command(name="view-hashtag-videos", description="displays videos of a hashtag", mixinStandardHelpOptions = true)
public class ViewHashtagVideos implements Runnable {
	
	@Inject
	HashtagsClient client;
	
	@Parameters(index="0")
	private Long id;
	
	@Override
	public void run() {
		Video[] importedArray = client.getHashtagVideos(id);
		for (int i = 0;  i < importedArray.length; i++) {
			System.out.println(importedArray[i].getTitle());
		}		
	}	
}
