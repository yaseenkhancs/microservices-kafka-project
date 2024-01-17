package myassessment.videomicroservice.events;

import io.micronaut.context.annotation.Factory;

@Factory
public class VideosStream {

	public KStream<Long, Video> Videoliked(ConfiguredStreamBuilder builder){
	
	}	
	public KStream<Long, Video> Videoposted(ConfiguredStreamBuilder builder){
	
	}	
}