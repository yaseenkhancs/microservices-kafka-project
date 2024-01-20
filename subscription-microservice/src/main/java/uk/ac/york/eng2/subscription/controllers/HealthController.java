package uk.ac.york.eng2.subscription.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HealthController extends BaseHealthController {
	
	@Get("/")
	public HttpResponse<String> heartbeat() {
		return HttpResponse.ok("SERVICE RESPONDED");
	}

}