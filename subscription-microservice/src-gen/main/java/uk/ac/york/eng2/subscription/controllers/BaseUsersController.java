package uk.ac.york.eng2.subscription.controllers;

import uk.ac.york.eng2.subscription.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscription.repositories.UsersRepository;
import jakarta.inject.Inject;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.subscription.domain.Hashtag;
import uk.ac.york.eng2.subscription.domain.User;

public class BaseUsersController {
	
	
	HashtagsRepository hashtagsRepo;	
	
	UsersRepository usersRepo;	
	
	
}