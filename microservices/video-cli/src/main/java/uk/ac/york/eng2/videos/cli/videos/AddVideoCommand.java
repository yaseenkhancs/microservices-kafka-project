package uk.ac.york.eng2.videos.cli.videos;

import java.util.ArrayList;
import java.util.Collection;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;
import uk.ac.york.eng2.videos.cli.hashtags.HashtagsClient;
import uk.ac.york.eng2.videos.cli.users.UsersClient;

@Command(name="post-video", description="Posts a video", mixinStandardHelpOptions = true)
public class AddVideoCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Inject
	private UsersClient uclient;
	
	@Inject
	private HashtagsClient hclient;

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private Integer author;
	
	@Parameters(index="2")
	private Integer tag;
	
	@Override
	public void run() {
		User usr = new User();
		usr.setId((long)author);
		usr.setUsername(uclient.getUser(author).getUsername());
		
		Hashtag newhash = new Hashtag();
		newhash.setId((long)tag);
		newhash.setName(hclient.getTag(tag).getName());
		
		Collection<Hashtag> colhash = new ArrayList<Hashtag>();
		colhash.add(newhash);
		
		VideoDTO dto = new VideoDTO();
		dto.setTitle(title);
		dto.setAuthor(usr);
		dto.setTags(colhash);
		dto.setNlikes(0);
		dto.setNdislikes(0);
		dto.setNviews(0);
		dto.setWatchers(null);

		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}

}