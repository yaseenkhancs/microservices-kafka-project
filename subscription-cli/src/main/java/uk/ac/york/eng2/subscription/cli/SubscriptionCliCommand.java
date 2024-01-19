package uk.ac.york.eng2.subscription.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.hashtags.AddHashtagCommand;
import uk.ac.york.eng2.subscription.cli.hashtags.GetHashtags;
import uk.ac.york.eng2.subscription.cli.hashtags.ViewHashtagVideos;
import uk.ac.york.eng2.subscription.cli.health.HeartBeatCommand;
import uk.ac.york.eng2.subscription.cli.users.AddSubscriptionCommand;
import uk.ac.york.eng2.subscription.cli.users.AddUserCommand;
import uk.ac.york.eng2.subscription.cli.users.DeleteSubscriptionCommand;
import uk.ac.york.eng2.subscription.cli.users.GetUsersCommand;
import uk.ac.york.eng2.subscription.cli.users.ViewSubscriptions;
import uk.ac.york.eng2.subscription.cli.users.ViewUserSubscriptionVideos;
import uk.ac.york.eng2.subscription.cli.users.ViewWatchedVideos;
import uk.ac.york.eng2.subscription.cli.videos.AddVideoCommand;
import uk.ac.york.eng2.subscription.cli.videos.AddVideoHashtag;
import uk.ac.york.eng2.subscription.cli.videos.AddVideoWatcherCommand;
import uk.ac.york.eng2.subscription.cli.videos.DislikeVideoCommand;
import uk.ac.york.eng2.subscription.cli.videos.GetVideosCommand;
import uk.ac.york.eng2.subscription.cli.videos.LikeVideoCommand;

@Command(name = "subscription-cli", description = "...",
        mixinStandardHelpOptions = true, subcommands = {GetVideosCommand.class,
        		GetHashtags.class, GetUsersCommand.class, AddVideoCommand.class,
        		AddUserCommand.class, AddHashtagCommand.class, AddVideoHashtag.class,
        		AddVideoWatcherCommand.class, LikeVideoCommand.class, 
        		DislikeVideoCommand.class, AddSubscriptionCommand.class,
        		ViewHashtagVideos.class, ViewSubscriptions.class, ViewWatchedVideos.class,
        		ViewUserSubscriptionVideos.class, DeleteSubscriptionCommand.class,
        		HeartBeatCommand.class})
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
