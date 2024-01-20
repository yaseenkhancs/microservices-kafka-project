package uk.ac.york.eng2.videos.cli;

import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.videos.cli.hashtags.AddHashtag;
import uk.ac.york.eng2.videos.cli.hashtags.GetHashtag;
import uk.ac.york.eng2.videos.cli.hashtags.GetHashtags;
import uk.ac.york.eng2.videos.cli.health.HeartBeatCommand;
import uk.ac.york.eng2.videos.cli.users.AddUserCommand;
import uk.ac.york.eng2.videos.cli.users.GetUserCommand;
import uk.ac.york.eng2.videos.cli.users.GetUsersCommand;
import uk.ac.york.eng2.videos.cli.videos.AddVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.AddVideoHashtag;
import uk.ac.york.eng2.videos.cli.videos.AddVideoWatcherCommand;
import uk.ac.york.eng2.videos.cli.videos.DeleteVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.DislikeVideo;
import uk.ac.york.eng2.videos.cli.videos.GetAuthorsVideosCommand;
import uk.ac.york.eng2.videos.cli.videos.GetHashtagsVideos;
import uk.ac.york.eng2.videos.cli.videos.GetTagsVideos;
import uk.ac.york.eng2.videos.cli.videos.GetVideoAuthor;
import uk.ac.york.eng2.videos.cli.videos.GetVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoHashtagsCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoWatchersCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideosCommand;
import uk.ac.york.eng2.videos.cli.videos.LikeVideo;
import uk.ac.york.eng2.videos.cli.videos.UpdateVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.WatchVideo;

@Command(name = "video-cli", description = "...", mixinStandardHelpOptions = true, 
		subcommands = {GetVideosCommand.class, AddVideoCommand.class, GetVideoCommand.class,
						UpdateVideoCommand.class, DeleteVideoCommand.class, GetAuthorsVideosCommand.class,
						GetTagsVideos.class, WatchVideo.class, LikeVideo.class, DislikeVideo.class, AddVideoWatcherCommand.class,
						GetVideoWatchersCommand.class, GetUsersCommand.class, AddUserCommand.class, GetUserCommand.class,
						GetHashtag.class, GetHashtags.class, AddHashtag.class, GetVideoHashtagsCommand.class,
						GetVideoAuthor.class, AddVideoHashtag.class, GetHashtagsVideos.class, HeartBeatCommand.class})
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
