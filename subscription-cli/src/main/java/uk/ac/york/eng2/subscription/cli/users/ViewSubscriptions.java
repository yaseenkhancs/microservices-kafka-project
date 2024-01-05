package uk.ac.york.eng2.subscription.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Hashtag;

@Command(name="view-subscriptions", description="views subscriptions of a user", mixinStandardHelpOptions = true)
public class ViewSubscriptions implements Runnable {
	
	@Inject
	UsersClient client;
	
	@Parameters(index="0")
	private Long id;
	

	@Override
	public void run() {
		Hashtag[] importedHashtags = client.getSubscribedHashtags(id);
		for (Hashtag x : importedHashtags) {
			System.out.println(x.getName());
		}
	}

}
