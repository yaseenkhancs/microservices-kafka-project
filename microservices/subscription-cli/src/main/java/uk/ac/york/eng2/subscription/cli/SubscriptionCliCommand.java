package uk.ac.york.eng2.subscription.cli;

import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.subscription.cli.hashtags.ViewHashtagVideos;
import uk.ac.york.eng2.subscription.cli.health.HeartBeatCommand;
import uk.ac.york.eng2.subscription.cli.users.AddSubscriptionCommand;
import uk.ac.york.eng2.subscription.cli.users.DeleteSubscriptionCommand;
import uk.ac.york.eng2.subscription.cli.users.ViewSubscriptions;
import uk.ac.york.eng2.subscription.cli.users.ViewUserSubscriptionVideos;
import uk.ac.york.eng2.subscription.cli.users.ViewWatchedVideos;

@Command(name = "subscription-cli", description = "...",
        mixinStandardHelpOptions = true, subcommands = {        		
        		AddSubscriptionCommand.class, ViewHashtagVideos.class, ViewSubscriptions.class, 
        		ViewWatchedVideos.class, ViewUserSubscriptionVideos.class, 
        		DeleteSubscriptionCommand.class, HeartBeatCommand.class})
public class SubscriptionCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(SubscriptionCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
