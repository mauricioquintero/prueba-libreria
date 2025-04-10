package com.example.demo.model;

import lombok.Data;

@Data
public class Book {
    private long id;
    private String title;
    private String author;
    private String isbn;
    private Integer totalCopies;
    private Integer availableCopies;
}
