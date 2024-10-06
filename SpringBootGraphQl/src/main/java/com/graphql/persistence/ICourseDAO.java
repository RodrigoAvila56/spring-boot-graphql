package com.graphql.persistence;

import com.graphql.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseDAO extends CrudRepository<Course,Long> {
}
