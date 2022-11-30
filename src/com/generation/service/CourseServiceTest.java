package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {
    // import object from CourseService
    public CourseService courseService;
    // before each test implement this constructor
    @BeforeEach
    void setUp() {
        courseService = new CourseService(); }

    @Test
    void getCourseNull() {
        Course course = courseService.getCourse("Invalid Code");
        assertNull(course);
    }

    @Test
    void registerCourse() {
        Module moduleWebFundamentals = new Module("INTRO-WEB", "Web Development Fundamentals",
                "Introduction to fundamentals of web development" );
        Course course = new Course("INTRO-WEB-7", "Introduction to JavaScript for Web Development", 9, moduleWebFundamentals );
        courseService.registerCourse(course);
        Course course1 = courseService.getCourse("INTRO-WEB-7");
        assertEquals(course, course1);
    }
}