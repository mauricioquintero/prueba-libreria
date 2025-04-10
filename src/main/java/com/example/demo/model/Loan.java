package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Loan {
    private Long id;
    private Long studentId;
    private Long bookId;
    private Date loanDate;
    private Date returnDate;
    private boolean returned;
}
