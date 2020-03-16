package io.u02.service;

import io.u02.model.Book;
import io.u02.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional; // -

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll()
                .forEach(books::add);
        return books;
    }

    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id); // -
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(Long id, Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id); //-
    }

}
