package io.u02.controller;

import io.u02.model.Book;
import io.u02.service.BookService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/books")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/books/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable Long id) {
        bookService.updateBook(id, book);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

}
