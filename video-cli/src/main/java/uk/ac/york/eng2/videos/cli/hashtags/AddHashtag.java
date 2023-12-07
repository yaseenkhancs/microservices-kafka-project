package uk.ac.york.eng2.videos.cli.hashtags;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.HashtagDTO;
import uk.ac.york.eng2.videos.cli.dto.UserDTO;
import uk.ac.york.eng2.videos.cli.hashtags.HashtagsClient;

@Command(name="add-tag", description="Adds a tag", mixinStandardHelpOptions = true)
public class AddHashtag implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		HashtagDTO dto = new HashtagDTO();
		dto.setName(name);

		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
