package com.generation.service;

import com.generation.model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {
    //import CourseService object
    public CourseService courseService;
    //implement this constructor before each test
    @BeforeEach
    void setUp(){
        courseService = new CourseService();
    }
    @Test
    void getCourse() {
        //assigning a var to getCourse's answer and converting it as a string
        String code = String.valueOf(courseService.getCourse("INTRO-WEB-1"));
        //assigning the answer string as a var
        String answer = "Course{code='INTRO-WEB-1', name='Introduction to Web Applications', credits=9, module=Module{name='Web Development Fundamentals'}}";
        assertEquals(answer,code);
    }
    @Test
    void getCourseNull() {
        //assigning a var to getCourse's answer and converting it as a string
        String code = String.valueOf(courseService.getCourse("INTRO-W3B-2"));
        //assigning the expected answer string as a var
        String answer = "null";
        //null is in a string because we made the valueOf null into a string within code assignment
        assertEquals(answer,code);
    }

}