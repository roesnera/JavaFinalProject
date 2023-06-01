package com.generation.service;

import com.generation.model.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CourseServiceTest {

    CourseService courseService = new CourseService();//create an object
    Course course=new Course("1234","computer",4,null);

    @Test
    void registerCourse() {
        courseService.registerCourse(course);
        assertNotNull(courseService);
    }

    @Test
    void getCourse() {
        assertNull(courseService.getCourse("1234"));
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