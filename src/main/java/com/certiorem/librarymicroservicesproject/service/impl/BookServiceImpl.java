package com.certiorem.librarymicroservicesproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.certiorem.librarymicroservicesproject.domain.bookmodel.Book;
import com.certiorem.librarymicroservicesproject.repository.BookRepository;
import com.certiorem.librarymicroservicesproject.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Transactional
	public Book createUpdateBook(Book book) {
		return bookRepository.save(book);
	}

	@Transactional
	public Book getBook(Integer id) {
		return bookRepository.getOne(id);
	}

	@Transactional
	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);		
	}

	@Transactional
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Transactional
	public List<Book> getBooksByEditorialId(Integer editorialId) {
		return bookRepository.findByEditorialId(editorialId);
	}

	@Transactional
	public List<Book> getBooksByGenreId(Integer genreId) {
		return bookRepository.findByBookGenreId(genreId);
	}
	
}
