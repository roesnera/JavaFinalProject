package com.generation.service;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {
    StudentService studentService;
    @BeforeEach
    void setUp() {
        studentService = new studentService();

    }

    @Test

    void showSummary() {
        studentService.showSummary();
    }
    @Test
    void enrollToCourse() {
        studentService.enrollToCourse("1", new Course("INTRO-CS-1", "Introduction to Computer Science", 9, new Module("INTRO-CS", "Introduction to Computer Science", "Introductory module for the generation technical programs")));
    }

}
