package uk.ac.york.eng2.trending.cli;

import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.trending.cli.hashtags.GetHashtags;
import uk.ac.york.eng2.trending.cli.hashtags.GetTrending;
import uk.ac.york.eng2.trending.cli.health.HeartBeatCommand;

@Command(name = "trending-hashtag-cli", description = "...",
        mixinStandardHelpOptions = true,
        subcommands = {GetHashtags.class, GetTrending.class, HeartBeatCommand.class})
public class TrendingHashtagCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(TrendingHashtagCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
