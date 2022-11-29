package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    //Declare courseService variable for the test
    CourseService courseService = new CourseService();

    ////Only method's type that is not void can be tested. So, I created two  for getting course information below
    @Test
    void getCourse() {
        assertEquals(courseService.getCourse("INTRO-CS-1").getCredits(), 9);
    }

    @Test
    void getCourse2() {
        assertEquals(courseService.getCourse("INTRO-CS-4").getName(), "Algorithm Design and Problem Solving - Advanced");
    }
}