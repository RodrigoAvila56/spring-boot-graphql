package com.graphql.service;

import com.graphql.entity.Course;
import com.graphql.entity.Student;

import java.util.List;

public interface ICourseService {

    Course findById(Long id);

    List<Course> findAll();

    void createCourse(Course course);

    void deleteById(Long id);

}
