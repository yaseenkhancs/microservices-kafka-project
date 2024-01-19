package uk.ac.york.eng2.subscription.controllers;

import io.micronaut.http.HttpResponse;

public class HealthController {
	
	public HttpResponse<String> heartbeat() {
		return HttpResponse.ok("SERVICE RESPONDED");
	}

}