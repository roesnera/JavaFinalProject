package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    public StudentService studentService;

    @BeforeEach
    void setUp(){
        studentService = new StudentService();
    }

    @org.junit.jupiter.api.Test
    void subscribeStudent() {
        Student s = new Student("10101", "Adam", "jdf@email", new Date());
        studentService.subscribeStudent(s);
        Student s2 = studentService.findStudent("10101");
        assertEquals(s, s2);
    }

    @org.junit.jupiter.api.Test
    void findStudentNull() {
        Student s = studentService.findStudent("");
        assertEquals(null, s);
    }
}