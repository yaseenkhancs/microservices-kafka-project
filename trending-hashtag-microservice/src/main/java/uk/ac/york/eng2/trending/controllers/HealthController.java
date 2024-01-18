package uk.ac.york.eng2.trending.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HealthController {
	
	@Get("/")
	public HttpResponse<String> heartbeat() {
		return HttpResponse.ok("SERVICE RESPONDED");
	}

}
