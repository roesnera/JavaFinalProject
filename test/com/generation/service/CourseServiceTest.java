package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    public CourseService courseService;

    @BeforeEach
    void setUp(){
        courseService = new CourseService();
    }

    @Test
    void getCourseNull() {
        Course c = courseService.getCourse("Invalid Code");
        assertEquals(null, c);
    }

    @Test
    void registerCourse() {
        Module moduleWebFundamentals = new Module( "INTRO-WEB", "Web Development Fundamentals",
                "Introduction to fundamentals of web development" );
        Course c = new Course( "INTRO-WEB-7", "Introduction to Bootstrap Framework", 9, moduleWebFundamentals );
        courseService.registerCourse(c);
        Course c2 = courseService.getCourse("INTRO-WEB-7");
        assertEquals(c, c2);
    }
}