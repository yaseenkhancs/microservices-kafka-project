package uk.ac.york.eng2.videos.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.videos.cli.domain.User;

@Command(name="get-users", description="Gets all the users", mixinStandardHelpOptions = true)
public class GetUsersCommand implements Runnable {

	@Inject
	private UsersClient client;

	@Override
	public void run() {
		for (User u : client.list()) {
			System.out.printf("User %d: %s\n", u.getId(), u.getUsername());
		}
	}

}
