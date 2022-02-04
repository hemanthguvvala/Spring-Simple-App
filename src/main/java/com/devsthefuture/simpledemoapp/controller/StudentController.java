package com.devsthefuture.simpledemoapp.controller;

import com.devsthefuture.simpledemoapp.model.Student;
import com.devsthefuture.simpledemoapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return service.createStudent(student);
    }
}
