package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    public StudentService studentService=new StudentService();
    public Student student=new Student("1234","yvette","yvette@email.com",null);


    @Test
    void subscribeStudent() {
        studentService.subscribeStudent(student); //adds student object
        assertTrue(studentService!=null); //checkks that student service is not null
    }

    @Test
    void findStudent() {
        assertNull(studentService.findStudent("1234"));

    }

    @Test
    void showSummary() {

    }

    @Test
    void enrollToCourse() {

    }
}