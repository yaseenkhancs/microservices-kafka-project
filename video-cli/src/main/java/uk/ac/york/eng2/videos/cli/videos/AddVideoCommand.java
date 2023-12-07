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
import uk.ac.york.eng2.videos.cli.users.UsersClient;

@Command(name="post-video", description="Posts a video", mixinStandardHelpOptions = true)
public class AddVideoCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Inject
	private UsersClient uclient;

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private Integer author;
	
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
		User usr = new User();
		usr.setId((long)author);
		usr.setUsername(uclient.getUser(author).getUsername());
		VideoDTO dto = new VideoDTO();
		dto.setTitle(title);
		dto.setAuthor(usr);
		dto.setTags(stringToSet(tagstring));
		dto.setNlikes(0);
		dto.setNdislikes(0);
		dto.setNviews(0);
		dto.setWatchers(null);

		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}

}