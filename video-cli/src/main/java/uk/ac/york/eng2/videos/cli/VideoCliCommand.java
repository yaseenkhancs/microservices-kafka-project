package uk.ac.york.eng2.videos.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.videos.AddVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.DeleteVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.GetAuthorsVideosCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideosCommand;
import uk.ac.york.eng2.videos.cli.videos.UpdateVideoCommand;

@Command(name = "video-cli", description = "...", mixinStandardHelpOptions = true, 
		subcommands = {GetVideosCommand.class, AddVideoCommand.class, GetVideoCommand.class,
						UpdateVideoCommand.class, DeleteVideoCommand.class, GetAuthorsVideosCommand.class})
public class VideoCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(VideoCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!!!");
        }
    }
}
