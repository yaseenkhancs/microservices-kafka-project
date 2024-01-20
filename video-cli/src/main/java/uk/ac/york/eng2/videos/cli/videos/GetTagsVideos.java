package uk.ac.york.eng2.videos.cli.videos;

import java.util.ArrayList;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="get-tags-videos", description="Gets all the videos from a tag", mixinStandardHelpOptions = true)
public class GetTagsVideos implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String tag;
	
	ArrayList<Hashtag> retrieved = new ArrayList<Hashtag>();
	ArrayList<String> retNames = new ArrayList<String>();
	
	@Override
	public void run() {
		for (Video v : client.list()) {
			retrieved = (ArrayList<Hashtag>) v.getTags();
			for (Hashtag h : retrieved) {
				retNames.add(h.getName());
			}
			
			if (retNames.contains(tag)) {
				System.out.println(v);
			}
		}
	}

}