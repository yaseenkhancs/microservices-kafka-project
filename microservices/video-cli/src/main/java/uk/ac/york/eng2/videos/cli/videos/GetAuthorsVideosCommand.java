package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.users.UsersClient;

@Command(name="get-authors-videos", description="Gets all the videos from an author", mixinStandardHelpOptions = true)
public class GetAuthorsVideosCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Inject
	private UsersClient uclient;

	@Parameters(index="0")
	private Integer author;
	
	@Override
	public void run() {
		for (Video v : client.list()) {
			if (client.getVideoAuthor(v.getId()).getId() == uclient.getUser(author).getId()) {
				System.out.printf("Video %d: %s\n", v.getId(), v.getTitle());
			}
		}
	}
}