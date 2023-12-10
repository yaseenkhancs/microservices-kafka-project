package uk.ac.york.eng2.trending.cli.hashtags;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.trending.cli.domain.Hashtag;

@Command(name="add-tag", description="Adds a tag", mixinStandardHelpOptions = true)
public class AddHashtag implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		Hashtag ht = new Hashtag();
		ht.setName(name.toLowerCase());

		HttpResponse<Void> response = client.add(ht);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
