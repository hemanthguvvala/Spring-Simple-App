package com.devsthefuture.simpledemoapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "student007")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "stdname")
    private String studentName;
    @Column(name = "sbranch")
    private String branch;
    private int age;
}
