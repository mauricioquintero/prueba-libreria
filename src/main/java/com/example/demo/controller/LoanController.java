package com.example.demo.controller;

import com.example.demo.model.Loan;
import com.example.demo.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @GetMapping
    public List<Loan> getAll() {
        return loanService.getAll();
    }

    @GetMapping("/{id}")
    public Loan getById(@PathVariable Long id) {
        return loanService.getById(id);
    }

    @GetMapping("/student/{studentId}")
    public List<Loan> getByStudent(@PathVariable Long studentId) {
        return loanService.getByStudentId(studentId);
    }

    @PostMapping
    public void createLoan(Loan loan) {
        loanService.createLoan(loan);
    }

    @PutMapping("/{id}/return")
    public void returnLoan(@PathVariable Long id) {
        loanService.returnBook(id);
    }
}
