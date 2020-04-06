package io.u02.service;

import io.u02.entity.BookEntity;
import io.u02.mapper.BookMapper;
import io.u02.model.Book;
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

    @Autowired
    BookMapper bookMapper;

    public List<BookEntity> getAllBooks() {
        List<BookEntity> books = new ArrayList<BookEntity>();
        bookRepository.findAll()
                .forEach(books::add);
        return books;
    }

    public Optional<BookEntity> getBook(Long id) {
        return bookRepository.findById(id); // -
    }

    public void addBook(Book book) {
        BookEntity bookEntity = bookMapper.mapToEntity(book);
        bookRepository.save(bookEntity); }

    public void updateBook(Long id, Book book) {
        BookEntity bookEntity = bookMapper.mapToEntity(book);
        bookRepository.save(bookEntity); }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id); //-
    }

}
