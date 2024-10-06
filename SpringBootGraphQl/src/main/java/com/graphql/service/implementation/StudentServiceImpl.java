package com.graphql.service.implementation;

import com.graphql.entity.Student;
import com.graphql.persistence.IStudentDAO;
import com.graphql.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDAO studentDao;

    @Override
    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentDao.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return (List<Student>) studentDao.findAll();
    }

    @Override
    @Transactional
    public void createStudent(Student student) {
        studentDao.save(student);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }
}
