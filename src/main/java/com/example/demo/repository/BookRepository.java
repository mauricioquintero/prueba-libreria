package com.example.demo.repository;

import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookRepository {
    List<Book> findAll();
    Book findById(long id);
    void insert(Book book);
    void update(Book book);
    void delete(long id);
}
