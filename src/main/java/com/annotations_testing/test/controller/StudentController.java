package com.annotations_testing.test.controller;

import com.annotations_testing.test.TestBean;
import com.annotations_testing.test.entity.Student;
import com.annotations_testing.test.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.annotations_testing.test.service.StudentService;

import java.util.List;
import java.util.Optional;


@ComponentScan
@RestController
@RequestMapping("/students")
@PropertySource("classpath:custom.properties")
@Scope("prototype")
public class StudentController {

    @Autowired  // Without this you will get a NullPointerException whitelabel Error Page
    @Qualifier("studentServiceImpl")  // make sure to lowerCase the bean name this overRides @Primary
    private StudentService studentService;

    @Autowired
    private TestBean testBean;


  @PostMapping("/save")
  // not needed but just know
//  @RequestMapping(value = "/save",method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
  public ResponseEntity<Student> addStudent(@RequestBody Student student) {
      return ResponseEntity.ok(studentService.addStudent(student));
  }


  @GetMapping("/{id}")
  public ResponseEntity<Optional<Student>> getStudent(@PathVariable int id) throws StudentNotFoundException {
      Optional<Student> student = studentService.getStudent(id);
      if (student.isPresent()) {
          return ResponseEntity.ok(student);
      } else {
          throw new StudentNotFoundException("student not found with id " + id);
      }
  }

  @GetMapping("/all")
    public ResponseEntity<List<Student>> getStudents() {
      testBean.method();
      return ResponseEntity.ok(studentService.getStudents());
  }
}
