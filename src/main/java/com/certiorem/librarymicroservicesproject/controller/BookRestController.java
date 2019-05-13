package com.certiorem.librarymicroservicesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.certiorem.librarymicroservicesproject.constants.BookPathConstants;
import com.certiorem.librarymicroservicesproject.model.bookmodel.Book;
import com.certiorem.librarymicroservicesproject.modelservice.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	@ResponseBody
	public String borrarMetodo() {
		return "Hola";
	}
	
	@PostMapping(BookPathConstants.BOOK_SERVICE_SAVE)
	@ResponseBody
	public Book createBook(@RequestBody Book book) {
		return bookService.createUpdateBook(book);
	}
	
	@GetMapping(BookPathConstants.BOOK_SERVICE_READ)
	@ResponseBody
	public Book getBookById(@RequestParam String id) {
		return bookService.getBook(Integer.parseInt(id));
	}
	
	@DeleteMapping(BookPathConstants.BOOK_SERVICE_DELETE)
	@ResponseBody
	public void deleteBook(@RequestParam String id) {
		bookService.deleteBook(Integer.parseInt(id));
	}
	
	@GetMapping(BookPathConstants.BOOK_SERVICE_ALL_BOOKS)
	@ResponseBody
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping(BookPathConstants.BOOK_SERVICE_GET_BY_EDITORIAL)
	@ResponseBody
	public List<Book> getBooksByEditorial(@RequestParam String editorialId) {
		return bookService.getBooksByEditorialId(Integer.parseInt(editorialId));
	}
	
	@GetMapping(BookPathConstants.BOOK_SERVICE_GET_BY_GENRE)
	@ResponseBody
	public List<Book> getBooksByGenre(@RequestParam String bookGenreId) {
		return bookService.getBooksByGenreId(Integer.parseInt(bookGenreId));
	}

}
