package uk.ac.york.eng2.subscription.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.hashtags.AddHashtagCommand;
import uk.ac.york.eng2.subscription.cli.hashtags.GetHashtags;
import uk.ac.york.eng2.subscription.cli.users.AddUserCommand;
import uk.ac.york.eng2.subscription.cli.users.GetUsersCommand;
import uk.ac.york.eng2.subscription.cli.videos.AddVideoCommand;
import uk.ac.york.eng2.subscription.cli.videos.GetVideosCommand;

@Command(name = "subscription-cli", description = "...",
        mixinStandardHelpOptions = true, subcommands = {GetVideosCommand.class,
        		GetHashtags.class, GetUsersCommand.class, AddVideoCommand.class,
        		AddUserCommand.class, AddHashtagCommand.class})
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
