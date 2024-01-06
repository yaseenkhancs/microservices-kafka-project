package video-microservice.events;

import io.micronaut.context.annotation.Factory;

@Factory
public class Vidstream {

	public KStream<Long id, Video v> Videoposted(ConfiguredStreamBuilder builder){
	
	}	
}