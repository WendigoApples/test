package com.annotations_testing.test.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "STUDENT_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courcse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private int id;

    @Column(name = "COURSE_NAME")
    private int courseName;

    @Column(name = "STUDENT")
    private int student;

}
