package uk.ac.york.eng2.videos;

import io.micronaut.runtime.Micronaut;

public class BaseApplication {
	
	public static void main(String[] args) {
		Micronaut.run(Application.class, args);
	}	
}