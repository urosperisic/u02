package io.u02.service;

import io.u02.entity.BookEntity;
import io.u02.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    public List<BookEntity> getAllBooks();

    public Optional<BookEntity> getBook(Long id);

    public void addBook(Book book);

    public void updateBook(Long id, BookEntity book);

    public void deleteBook(Long id);

}
