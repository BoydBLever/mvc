package com.boydlever.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boydlever.mvc.models.Book;

import antlr.collections.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
	List<Book> findByDescriptionContaining(String search);
	//look in the spring io documentation for jpa repositories
	//find Query Creation
	//List<Book> findById(ID id);
	//List<Book> deleteById(ID id);
	//List<Book> save(S entity);
	
}
