package com.boydlever.mvc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boydlever.mvc.models.Book;
import com.boydlever.mvc.repositories.BookRepository;

import antlr.collections.List;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	 // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
//Now that the book service is set up, we also have to set up the controller