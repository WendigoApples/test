package com.annotations_testing.test;


import com.annotations_testing.test.entity.Student;
import com.annotations_testing.test.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EntityScan("com.annotations_testing.test")
public class AnnotationCheatsheetApplication {

    @Autowired
    private StudentRepository studentRepository;

    public AnnotationCheatsheetApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @PostConstruct

    @ExceptionHandler
    public void initStudents() {
        studentRepository.saveAll(Stream.of(
                        new Student(102, "Tim", 14, "Math"),
                        new Student(102, "Lee", 48, "Computer Science"),
                        new Student(103, "Bob", 16, "Math"),
                        new Student(104, "Lucy", 12, "Biology"))
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        SpringApplication.run(AnnotationCheatsheetApplication.class, args);

    }

}
