package uk.ac.york.eng2.videos.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.HashtagDTO;

@Command(name="get-hashtag", description="Gets a specific hashtag", mixinStandardHelpOptions = true)
public class GetHashtag implements Runnable {
	@Inject
	private HashtagsClient client;
	
	@Parameters(index="0")
	private Long id;
	
	@Override
	public void run() {
		HashtagDTO tag = client.getTag(id);
		if (tag == null) {
			System.err.println("Tag not found!");
			System.exit(1);
		} else {
			System.out.println(tag.getName());
		}
	}
	
}

