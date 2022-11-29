package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {
    CourseService cs = new CourseService();
    @Test
    void registerCourse() {
      //  Course course = new Course("INTRO-WEB-1", "Introduction to Web Applications", 9, moduleWebFundamentals );
       // assertEquals(cs.getCourse("INTRO-WEB-1"),cs.registerCourse(course));
    }

    @Test
    void getCourse() {
        assertEquals(cs.getCourse("Invalid Code"), null);
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