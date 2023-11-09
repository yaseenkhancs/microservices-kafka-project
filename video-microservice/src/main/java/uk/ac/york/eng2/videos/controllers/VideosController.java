package uk.ac.york.eng2.videos.controllers;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
//import uk.ac.york.eng2.books.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.repositories.VideosRepository;
//import uk.ac.york.eng2.books.repositories.UsersRepository;

@Controller("/videos")
public class VideosController {

	@Inject
	VideosRepository repo;

//	@Inject
//	UsersRepository userRepo;

	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO bookDetails) {
		Video video = new Video();
		video.setTitle(bookDetails.getTitle());
		video.setAuthor(bookDetails.getAuthor());
		video.setNlikes(0);
		video.setNdislikes(0);
		video.setNviews(0);

		repo.save(video);

		return HttpResponse.created(URI.create("/videos/" + video.getId()));
	}
	
//	@Get("/{id}")
//	public Book getBook (Long id) {		
//		return repo.findById(id).orElse(null);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Get("/{id}")
//	public BookDTO getBook(long id) {
//		return repo.findOne(id).orElse(null);
//	}

//	@Transactional
//	@Put("/{id}")
//	public HttpResponse<Void> updateBook(long id, @Body BookDTO bookDetails) {
//		Optional<Book> book = repo.findById(id);
//		if (book.isEmpty()) {
//			return HttpResponse.notFound();
//		}
//
//		Book b = book.get();
//		if (bookDetails.getTitle() != null) {
//			b.setTitle(bookDetails.getTitle());
//		}
//		if (bookDetails.getYear() != null) {
//			b.setYear(bookDetails.getYear());
//		}
//		repo.update(b);
//		return HttpResponse.ok();
//	}

//	@Transactional
//	@Delete("/{id}")
//	public HttpResponse<Void> deleteBook(long id) {
//		Optional<Book> book = repo.findById(id);
//		if (book.isEmpty()) {
//			return HttpResponse.notFound();
//		}
//
//		repo.delete(book.get());
//		return HttpResponse.ok();
//	}

//	@Get("/{id}/readers")
//	public Iterable<User> getReaders(long id) {
//		Optional<Book> oBook = repo.findById(id);
//		if (oBook.isEmpty()) {
//			return null;
//		}
//		return oBook.get().getReaders();
//	}

//	@Transactional
//	@Put("/{bookId}/readers/{userId}")
//	public HttpResponse<String> addReader(long bookId, long userId) {
//		Optional<Book> oBook = repo.findById(bookId);
//		if (oBook.isEmpty()) {
//			return HttpResponse.notFound(String.format("Book %d not found", bookId));
//		}
//
//		Optional<User> oUser = userRepo.findById(userId);
//		if (oUser.isEmpty()) {
//			return HttpResponse.notFound(String.format("User %d not found", userId));
//		}
//
//		Book book = oBook.get();
//		book.getReaders().add(oUser.get());
//		repo.update(book);
//
//		return HttpResponse.ok(String.format("User %d added as reader of book %d", userId, bookId));
//	}

//	@Transactional
//	@Delete("/{bookId}/readers/{userId}")
//	public HttpResponse<String> removeReader(long bookId, long userId) {
//		Optional<Book> oBook = repo.findById(bookId);
//		if (oBook.isEmpty()) {
//			return HttpResponse.notFound(String.format("Book %d not found", bookId));
//		}
//
//		/*
//		 * DELETE should be idempotent, so it's OK if the mentioned
//		 * user was not a reader of the book.
//		 */ 
//		Book book = oBook.get();
//		book.getReaders().removeIf(u -> userId == u.getId());
//		repo.update(book);
//
//		return HttpResponse.ok();
//	}

}
