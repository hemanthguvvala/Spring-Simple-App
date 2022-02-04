package com.devsthefuture.simpledemoapp.service;

import com.devsthefuture.simpledemoapp.model.Student;
import com.devsthefuture.simpledemoapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public Student createStudent(Student student) {
        return repository.save(student);

    }
}
