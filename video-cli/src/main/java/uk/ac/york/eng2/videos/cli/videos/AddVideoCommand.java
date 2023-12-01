package uk.ac.york.eng2.videos.cli.videos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="post-video", description="Posts a video", mixinStandardHelpOptions = true)
public class AddVideoCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private String author;
	
	@Parameters(index="2")
	private String tagstring;
	
	private HashSet<String> stringToSet(String s) {
		s = s.replaceAll("\\s", ""); //removes whitespace from the tags list
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(","))); //splits resulting string by commas
		HashSet<String> output = new HashSet<>(list);
		return output;
	}

	@Override
	public void run() {
		VideoDTO dto = new VideoDTO();
		dto.setTitle(title);
		dto.setAuthor(author);
		dto.setTags(stringToSet(tagstring));
		dto.setNlikes(0);
		dto.setNdislikes(0);
		dto.setNviews(0);
		dto.setWatchers(null);

		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}

}