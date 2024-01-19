package uk.ac.york.eng2.trending.cli.health;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("http://localhost:8081")
public interface HealthClient {
	
	@Get("/")
	HttpResponse<String> heartbeat();

}
