package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    CourseService courseServices;
    Course course;
    Student student;
    Date birthDate;


    @BeforeEach
    void setUp() {
        courseServices = new CourseService();
        birthDate = new Date();
        course = new Course("INTRO-CS-1", "Introduction to Computer Science", 9, new Module("INTRO-CS", "Introduction to Computer Science", "Introductory module for the generation technical programs"));
        student = new Student("232", "Sam", "sam@gmail.com", birthDate);
    }

    @Test
    void registerCourse() {
        courseServices.registerCourse(course);
    }

    @Test
    void getCourse() {
//        assertEquals(course, courseServices.getCourse(course.getCode()));
        assertEquals(null, courseServices.getCourse(null));
    }

    @Test
    void enrollStudent() {
        courseServices.enrollStudent(course.getCode(),student);
    }

    @Test
    void showEnrolledStudents() {
        courseServices.showEnrolledStudents(course.getCode());
    }

    @Test
    void showSummary() {
        courseServices.showSummary();
    }
}