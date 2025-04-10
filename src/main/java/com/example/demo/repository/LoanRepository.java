package com.example.demo.repository;

import com.example.demo.model.Loan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoanRepository {
    List<Loan> findAll();
    Loan findById(long id);
    List<Loan> findByStudentId(Long studentId);
    void insert(Loan loan);
    void markAsReturned(Long id);
}
