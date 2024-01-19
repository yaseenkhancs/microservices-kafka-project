package uk.ac.york.eng2.videos.cli.health;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;

@Command(name="heartbeat", description="Checks if service is alive", mixinStandardHelpOptions = true)
public class HeartBeatCommand implements Runnable {
	
	@Inject
	private HealthClient client;
	
	@Override
	public void run() {
		System.out.println(client.heartbeat().body());
	}

}
