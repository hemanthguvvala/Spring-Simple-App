package com.devsthefuture.simpledemoapp.repository;

import com.devsthefuture.simpledemoapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
