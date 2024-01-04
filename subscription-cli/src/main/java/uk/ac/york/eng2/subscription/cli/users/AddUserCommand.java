package uk.ac.york.eng2.subscription.cli.users;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.User;

@Command(name="add-user", description="Adds a user", mixinStandardHelpOptions = true)
public class AddUserCommand implements Runnable {

	@Inject
	private UsersClient client;
	
	@Parameters(index="0")
	private Long id;
	
	@Parameters(index="1")
	private String username;
	
	@Override
	public void run() {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		
		HttpResponse<Void> response = client.add(user);
		System.out.println("Server responded with: " + response.getStatus());
		
	}

}
