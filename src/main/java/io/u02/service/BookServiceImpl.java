package io.u02.service;

import io.u02.entity.BookEntity;
import io.u02.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    public List<BookEntity> getAllBooks() {
        List<BookEntity> books = new ArrayList<BookEntity>();
        bookRepository.findAll()
                .forEach(books::add);
        return books;
    }

    public Optional<BookEntity> getBook(Long id) {
        return bookRepository.findById(id); // -
    }

    public void addBook(BookEntity book) { bookRepository.save(book); }

    public void updateBook(Long id, BookEntity book) { bookRepository.save(book); }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id); //-
    }

}
