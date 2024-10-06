package com.graphql.persistence;

import com.graphql.entity.Course;
import com.graphql.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDAO  extends CrudRepository<Student,Long> {
}
