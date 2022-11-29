package com.generation.service;

import com.generation.model.Student;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    StudentService ss = new StudentService();

    @org.junit.jupiter.api.Test
    void subscribeStudent() {
        Student s1 = new Student("1", "Mathu", "mathu@gmail.com", new Date());
        ss.subscribeStudent(s1);
        Student s2 = ss.findStudent("1");
        assertEquals(s1, s2);
    }

    @org.junit.jupiter.api.Test
    void findStudent() {
        Student s = ss.findStudent("");
        assertEquals(null, s);
    }



    @org.junit.jupiter.api.Test
    void enrollToCourse() {
      // Student s4 = ss.enrollToCourse();
    }
}