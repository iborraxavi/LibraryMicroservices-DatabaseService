package com.certiorem.librarymicroservicesproject.service;

import java.util.List;

import com.certiorem.librarymicroservicesproject.domain.bookmodel.Book;

public interface BookService {
	
	public Book createUpdateBook(Book book);
	
	public Book getBook(Integer id);
	
	public void deleteBook(Integer id);
	
	public List<Book> getAllBooks();
	
	public List<Book> getBooksByEditorialId(Integer editorialId);
	
	public List<Book> getBooksByGenreId(Integer genreId);

}
