package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    CourseService courseService = new CourseService();
    Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
            "Introductory module for the generation technical programs" );
    Course testCourse = new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module );
    Module moduleWebFundamentals = new Module( "INTRO-WEB", "Web Development Fundamentals",
            "Introduction to fundamentals of web development" );
    Course testCourse2 = new Course( "INTRO-WEB-1", "Introduction to Web Applications", 9, moduleWebFundamentals );
    Course testCourse3 = new Course( "TEST-COURSE-1", "Introduction to JUNIT Testing", 10, moduleWebFundamentals );

    @Test
    void registerCourse() {
        courseService.registerCourse( testCourse3 );
        assertEquals(testCourse3.toString(), courseService.getCourse("TEST-COURSE-1").toString());
    }

    @Test
    void getCourse() {
        assertEquals(testCourse.toString(), courseService.getCourse("INTRO-CS-1").toString());
        assertEquals(testCourse2.toString(), courseService.getCourse("INTRO-WEB-1").toString());
    }

    @Test
    void enrollStudent() {
    }

    @Test
    void showEnrolledStudents() {
    }

    @Test
    void showSummary() {
    }
}