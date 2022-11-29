package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    Student student = new Student("2", "Jenna", "jen@site.com", new Date());
    StudentService studentService = new StudentService();

    @Test
    void subscribeStudent() {
        studentService.subscribeStudent(student);
    }

    @Test
    void findStudent() {
        studentService.subscribeStudent(student);
        assertSame(student, studentService.findStudent("2"));
    }

    @Test
    void showSummary() {
    }

    @Test
    void enrollToCourse() {
    }
}