package uk.ac.york.eng2.subscription.cli.videos;

import java.util.ArrayList;
import java.util.Collection;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.dto.VideoDTO;
import uk.ac.york.eng2.subscription.cli.hashtags.HashtagsClient;
import uk.ac.york.eng2.subscription.cli.users.UsersClient;
import uk.ac.york.eng2.subscription.cli.domain.Hashtag;
import uk.ac.york.eng2.subscription.cli.domain.User;

@Command(name="post-video", description="Posts a video", mixinStandardHelpOptions = true)
public class AddVideoCommand implements Runnable {
	
	@Inject
	private VideosClient client;
	
	@Inject
	private UsersClient uclient;
	
	@Inject
	private HashtagsClient hclient;
	
	@Parameters(index="0")
	private Long id;
	
	@Parameters(index="1")
	private String title;
	
	@Parameters(index="2")
	private Long author;
	
	@Parameters(index="3")
	private Long tag;
	
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
		
		VideoDTO video = new VideoDTO();
		video.setId(id);
		video.setTitle(title);
		video.setAuthor(usr);
		video.setTags(colhash);
		video.setNlikes(0);
		video.setNdislikes(0);
		video.setNviews(0);
		video.setWatchers(null);
		
		HttpResponse<Void> response = client.add(video);
		System.out.println("Server responded with: " + response.getStatus());
	}
	
}
