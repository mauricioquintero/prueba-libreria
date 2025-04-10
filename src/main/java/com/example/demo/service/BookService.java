package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepo;

    public List<Book> getAll() {
        List<Book> books = bookRepo.findAll();
        System.out.println("Books found: " + books);
        return books;
    }

    public Book getById(long id) {
        return bookRepo.findById(id);
    }

    @Transactional
    public void create(Book book) {
        bookRepo.insert(book);
    }

    public void update(Book book) {
        bookRepo.update(book);
    }

    public void delete(long id) {
        bookRepo.delete(id);
    }

}
