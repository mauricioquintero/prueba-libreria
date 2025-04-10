package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepo;

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student getById(Long id) {
        return studentRepo.findById(id);
    }

    public void create(Student student) {
        studentRepo.insert(student);
    }

    public void update(Student student) {
        studentRepo.update(student);
    }

    public void delete(Long id) {
        studentRepo.delete(id);
    }
}
