package com.annotations_testing.test.service;

import com.annotations_testing.test.entity.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplV2 implements StudentService{

    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Optional<Student> getStudent(int id) {
        return Optional.empty();
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }
}
