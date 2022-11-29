package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    CourseService courseService = new CourseService();

    @Test
    void registerCourse() {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" );
        Course course1 = new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module );
        courseService.registerCourse(course1);

        Course course2 = courseService.getCourse("INTRO-CS-1");

        assertEquals( course2, course1);



    }

    @Test
    void getCourse() {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" );
        Course course = new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module );
        courseService.registerCourse(course);

        Course resp = courseService.getCourse("INTRO-CS-1");

        assertEquals( resp, course);
    }

    @Test
    void isAttendingCourse() {
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