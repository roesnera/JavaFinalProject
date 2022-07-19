package com.generation.service;

import com.generation.model.Student;
import com.generation.model.Person;
import com.generation.model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.lang.String;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService;
    Student student;
    Course course;
    Date birthDate;


    @BeforeEach
    void setUp() {
        studentService = new StudentService();
        birthDate = new Date();
        student = new Student("232", "Sam", "sam@gmail.com", birthDate);

    }

    @Test
    void subscribeStudent() {
        studentService.subscribeStudent(student);
    }

    @Test
    void findStudent() {
        assertEquals(course, studentService.findStudent(student.getId()));
    }

    @Test
    void showSummary() {
        studentService.showSummary();
    }

    @Test
    void enrollToCourse() {
        studentService.enrollToCourse(student.getId(), course);
    }
}