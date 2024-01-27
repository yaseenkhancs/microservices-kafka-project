package uk.ac.york.eng2.videos.controllers;

import io.micronaut.http.HttpResponse;

public class BaseHealthController {
	
	public HttpResponse<String> heartbeat() {
		return HttpResponse.ok("SERVICE RESPONDED");
	}

}