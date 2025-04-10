package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAll(){
        System.out.println("📞 Controller - GET /api/books called");
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable long id){
        return bookService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Book book){
        bookService.create(book);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Book book){
        book.setId(id);
        bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody Long id){
        bookService.delete(id);
    }
}
