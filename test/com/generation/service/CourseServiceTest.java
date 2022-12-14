package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    public CourseService courseService;

    @BeforeEach
    void setUp() {
        courseService = new CourseService();

    }

    @Test
    void getCourseNull() {
        Course course1 = courseService.getCourse("0");
        assertEquals(null, course1 );

    }


    @Test
    void registerCourse() {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" );
        Course course1 = new Course( "INTRO-CS-5", "Terminal Fundamentals", 9, module );
        courseService.registerCourse(course1);
        Course course2 = courseService.getCourse("INTRO-CS-5");
        assertEquals(course1, course2);
                
            }
        }


