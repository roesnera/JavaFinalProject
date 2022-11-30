package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    //import student and studentService object
    public Student student;
    public StudentService studentService;

    //execute before each test
    @BeforeEach
    void setUp(){
        studentService = new StudentService();
        //initialize students
        Student mitch = new Student("1", "mitch", "email", null);
        Student vector = new Student("2","vector", "email2", null);
    }
    @Test
    void findStudent() {
        Student temp = studentService.findStudent("2");
        assertEquals(null, temp );

    }

}