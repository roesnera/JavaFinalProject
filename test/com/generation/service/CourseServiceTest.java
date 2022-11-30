package com.generation.service;
import com.generation.model.Course;
import com.generation.model.Student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {
CourseService courseService = new CourseService();

    @Test
    void registerCourse() {
    Course course1= new Course ("INTRO-WEB-4", "Advanced HTML", 9, null);
      courseService.registerCourse(course1);
      Course course2 = courseService.getCourse("INTRO-WEB-4");
        assertEquals(course1, course2);
    }

    @Test
    void enrollStudent() {
        Student nicole = new Student("1", "Nicole", "emaile@email.com", null);
        courseService.enrollStudent("INTRO-WEB-4", nicole);
        assertTrue(true);

    }

}