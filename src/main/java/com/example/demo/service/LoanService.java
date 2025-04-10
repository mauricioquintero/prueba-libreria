package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.model.Loan;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final LoanRepository loanRepo;
    private final BookRepository bookRepo;

    public List<Loan> getAll() {
        return loanRepo.findAll();
    }

    public Loan getById(Long id) {
        return loanRepo.findById(id);
    }

    public List<Loan> getByStudentId(Long studentId) {
        return loanRepo.findByStudentId(studentId);
    }

    public void createLoan(Loan loan) {
        Book book = bookRepo.findById(loan.getBookId());
        if (book.getAvailableCopies() <= 0) {
            throw new RuntimeException("No copies available");
        }

        book.setAvailableCopies(book.getAvailableCopies() - 1);

        loanRepo.insert(loan);
    }

    public void returnBook(Long loanId) {
        Loan loan = loanRepo.findById(loanId);
        if (loan == null || loan.isReturned()) {
            throw new RuntimeException("Loan not found or already returned.");
        }

        Book book = bookRepo.findById(loan.getBookId());
        book.setAvailableCopies(book.getAvailableCopies() + 1);
        bookRepo.update(book);

        loanRepo.markAsReturned(loanId);
    }
}
