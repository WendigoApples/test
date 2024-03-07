package com.annotations_testing.test.repository;

import com.annotations_testing.test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}


