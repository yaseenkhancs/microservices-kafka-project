package uk.ac.york.eng2.videos.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * HealthController which handles heartbeat requests - 
 * should respond if the microservice is up.
 *  
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Controller("/")
public class HealthController {
	
	@Get("/")
	public HttpResponse<String> heartbeat() {
		return HttpResponse.ok("SERVICE RESPONDED");
	}

}
