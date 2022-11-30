package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    public StudentService studentService;

    @BeforeEach
    void testObj(){
        studentService = new StudentService();
    }

    @org.junit.jupiter.api.Test
    void subscribeStudent() {
    }

    @org.junit.jupiter.api.Test
    void findStudent() {
        Student stdnt = studentService.findStudent("");
        assertEquals(null, stdnt);
    }

    @org.junit.jupiter.api.Test
    void showSummary() {
    }

    @org.junit.jupiter.api.Test
    void enrollToCourse() {
    }
}