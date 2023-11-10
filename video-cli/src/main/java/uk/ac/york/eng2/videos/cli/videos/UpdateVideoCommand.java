package uk.ac.york.eng2.videos.cli.videos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="update-video", description="Updates a video", mixinStandardHelpOptions = true)
public class UpdateVideoCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Option(names = {"-t", "--title"}, description="Title of the video")
	private String title;

	@Option(names = {"-a", "--author"}, description="Author of the video")
	private String author;
	
	@Option(names = {"--hashtags", "--tags"}, description="Tags of the video")
	private String tagstring;

	@Option(names = {"--views", "--v"}, description="views of the video")
	private Integer views;
	
	@Option(names = {"--likes", "--l"}, description="likes of the video")
	private Integer likes;
	
	private HashSet<String> stringToSet(String s) {
		s = s.replaceAll("\\s", ""); //removes whitespace from the tags list
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(","))); //splits resulting string by commas
		HashSet<String> output = new HashSet<>(list);
		return output;
	}

	@Inject
	private VideosClient client;

	@Override
	public void run() {
		VideoDTO videoDetails = new VideoDTO();
		if (title != null) {
			videoDetails.setTitle(title);
		}
		if (author != null) {
			videoDetails.setAuthor(author);
		}
		if (tagstring != null) {
			videoDetails.setTags(stringToSet(tagstring));
		}
		if (views != null) {
			videoDetails.setNviews(views);
		}
		if (likes != null) {
			videoDetails.setNlikes(likes);
		}
		
		HttpResponse<Void> response = client.updateBook(id, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}

