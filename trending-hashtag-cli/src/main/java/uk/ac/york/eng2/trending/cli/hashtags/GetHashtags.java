package uk.ac.york.eng2.trending.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.trending.cli.domain.Hashtag;

@Command(name="get-tags", description="Gets all the tags", mixinStandardHelpOptions = true)
public class GetHashtags implements Runnable {
	
	@Inject
	private HashtagsClient client;
	
	@Override
	public void run() {
		for (Hashtag h : client.list()) {
			System.out.println(h.getName());
		}
	}

}
