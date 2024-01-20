package uk.ac.york.eng2.videos.cli.videos;

import java.util.ArrayList;
import java.util.Collection;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.hashtags.HashtagsClient;
import uk.ac.york.eng2.videos.cli.users.UsersClient;

@Command(name="update-video", description="Updates a video", mixinStandardHelpOptions = true)
public class UpdateVideoCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Option(names = {"-t", "--title"}, description="Title of the video")
	private String title;

	@Option(names = {"-a", "--author"}, description="Author of the video")
	private Integer author;
	
	@Option(names = {"--hashtags", "--tags"}, description="Tags of the video")
	private Integer tags;

	@Option(names = {"--views", "--v"}, description="views of the video")
	private Integer views;
	
	@Option(names = {"--likes", "--l"}, description="likes of the video")
	private Integer likes;

	@Inject
	private VideosClient client;
	
	@Inject
	private UsersClient uclient;
	
	@Inject
	private HashtagsClient hclient;

	@Override
	public void run() {
		Video videoDetails = new Video();
		if (title != null) {
			videoDetails.setTitle(title);
		}
		if (author != null) {
			User usr = new User();
			usr.setId((long)author);
			usr.setUsername(uclient.getUser(author).getUsername());
			videoDetails.setAuthor(usr);
		}
		if (tags != null) {
			
			Hashtag newhash = new Hashtag();
			newhash.setId((long)tags);
			newhash.setName(hclient.getTag(tags).getName());
			
			Collection<Hashtag> colhash = new ArrayList<Hashtag>();
			colhash.add(newhash);
			
			videoDetails.setTags(colhash);
		}
		if (views != null) {
			videoDetails.setNviews(views);
		}
		if (likes != null) {
			videoDetails.setNlikes(likes);
		}
		
		HttpResponse<Void> response = client.updateVideo(id, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}

