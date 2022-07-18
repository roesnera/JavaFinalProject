package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService;
    Date birthDate;
    Student student;
    Module moduleObj = new Module("Mip7qcJ", "Wfv", "K4f");
    Course courseObj = new Course("SV4", "10z6OG74", 438, moduleObj );

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
        birthDate = new Date();
        student = new Student("101", "Tylr", "Gulugagu.com", birthDate);
        studentService.subscribeStudent(student);
    }

    @Test
    void subscribeStudent() {
//        studentService.subscribeStudent(student);
        assertEquals(student, studentService.findStudent(student.getId()));
    }

    @Test
    void findStudent() {
//        studentService.subscribeStudent(student);
        assertEquals(student, studentService.findStudent(student.getId()));
    }

    @Test
    void showSummary() {
    }

    @Test
    void enrollToCourse() {
//        studentService.subscribeStudent(student);
        studentService.enrollToCourse(student.getId(), courseObj);
        assertEquals(true, student.isAttendingCourse(courseObj.getCode()));
    }
}