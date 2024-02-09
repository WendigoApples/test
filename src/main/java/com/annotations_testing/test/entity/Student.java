package com.annotations_testing.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType; // GeneratorType is no longer valid
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.EntityGraph;


@Entity
@Table(name = "STUDENT_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private int id;

    @Column(name = "STUDENT_NAME")
    private String name;

    @Column(name = "ROLL_NO")
    private int rollNo;

    @Column(name = "DEPT")
    private String dept;


}
