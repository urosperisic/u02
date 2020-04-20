package io.u02.service;

import io.u02.model.Book;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface BookService {

    public List<Book> getAllBooks();

    public Book getBook(Long id);

    public void addBook(Book book);

    public void updateBook(Long id, Book book);

    public void deleteBook(Long id);

}
