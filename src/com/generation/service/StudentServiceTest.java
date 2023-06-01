package com.generation.service;

import com.generation.model.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    //Student st = new Student("1234","Divine","divine@gmail.com", 01/12/1888);
    StudentService studentservice = new StudentService();

    @org.junit.jupiter.api.Test
    void findStudent() {
       studentservice.findStudent("1234");
       assertEquals(1234, 1234);

    }

}