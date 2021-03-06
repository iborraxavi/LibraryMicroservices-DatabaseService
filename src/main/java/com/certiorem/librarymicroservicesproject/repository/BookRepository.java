package com.certiorem.librarymicroservicesproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certiorem.librarymicroservicesproject.model.bookmodel.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	List<Book> findByEditorialId(Integer editorialId);
	
	List<Book> findByBookGenreId(Integer bookGenreId);
	
}
