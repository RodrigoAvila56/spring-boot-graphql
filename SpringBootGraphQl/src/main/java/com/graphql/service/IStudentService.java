package com.graphql.service;

import com.graphql.entity.Student;

import java.util.List;

public interface IStudentService {

    Student findById(Long id);

    List<Student> findAll();

    void createStudent(Student student);

    void deleteById(Long id);
}
