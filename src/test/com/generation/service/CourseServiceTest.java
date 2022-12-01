package com.generation.service;

import com.generation.model.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    public CourseService courseService = new CourseService();


    @Test
    void getCourseNull() {
        Course course = courseService.getCourse("Invalid Course Code");
        assertNull(course);
    }

}