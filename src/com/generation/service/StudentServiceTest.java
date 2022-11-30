package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    // import object from StudentService
    public StudentService studentService() {
        return null;
    }

    // before each test implement
    @BeforeEach
    void setUp() {
        StudentService StudentService = new StudentService();
    }

    @org.junit.jupiter.api.Test
    void showStudentSummary() {
        StudentService studentService = new StudentService();
        studentService.showSummary();
    }

    @org.junit.jupiter.api.Test
    void enrollToCourse() {
        StudentService studentService = new StudentService();
        Module module;
        studentService.enrollToCourse("1", new Course( "INTRO-CS-2", "Introduction to Algorithms",
                9, new Module("INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs")));
    }
}