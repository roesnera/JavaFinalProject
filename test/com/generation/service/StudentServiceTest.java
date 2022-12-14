package com.generation.service;

import com.generation.model.Student;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import javax.xml.namespace.QName;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    public StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }

    @org.junit.jupiter.api.Test
    void subscribeStudent() {
        Student stud = new Student("1", "Alem", "doch@gmail", new Date());
        studentService.subscribeStudent(stud);
        Student stud2 = studentService.findStudent("1");
        assertEquals(stud, stud2);
    }

    @org.junit.jupiter.api.Test
    void findStudent() {
        Student stud = studentService.findStudent("0");
        assertEquals(null, stud);
    }
}



