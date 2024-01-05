package uk.ac.york.eng2.subscription.cli.hashtags;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Hashtag;
import uk.ac.york.eng2.subscription.cli.hashtags.HashtagsClient;

@Command(name="add-tag", description="Adds a tag", mixinStandardHelpOptions = true)
public class AddHashtagCommand implements Runnable {

	@Inject
	private HashtagsClient client;
	
	@Parameters(index="0")
	private Long id;
	
	@Parameters(index="1")
	private String name;
	
	@Override
	public void run() {
		Hashtag hashtag = new Hashtag();
		hashtag.setId(id);
		hashtag.setName(name);
		
		HttpResponse<Void> response = client.add(hashtag);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
