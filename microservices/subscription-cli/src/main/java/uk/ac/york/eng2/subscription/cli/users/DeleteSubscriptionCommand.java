package uk.ac.york.eng2.subscription.cli.users;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-subscription", description="removes a subscription from a user", mixinStandardHelpOptions = true)
public class DeleteSubscriptionCommand implements Runnable {
	
	@Parameters(index="0")
	private Long userId;
	
	@Parameters(index="1")
	private Long hashtagId;
	
	@Inject
	UsersClient client;

	@Override
	public void run() {
		HttpResponse<String> response = client.deleteSubHashtag(userId, hashtagId);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
		
	}

}
