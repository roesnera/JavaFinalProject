package com.generation.service;
import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseServiceTest {

    CourseService courseService = new CourseService();

    @Test
    void getCourse() {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" );
        Course course = new Course("INTRO-CS-1", "Introduction to Computer Science", 9, module);
        assertEquals(course.toString(), courseService.getCourse("INTRO-CS-1").toString());


    }

    @Test
    void  registerCourse() {
          Module module = new Module( "INTRO-GD", "Introduction to Gardening",
                "Introductory module for the gardening programs" );
        Course course = new Course("INTRO-GD-1", "Introduction to soil prepping", 9, module);
        courseService.registerCourse(course);
        assertEquals(course, courseService.getCourse("INTRO-GD-1"));
    }

// you can write your own test methods and those methods needn't be there in your .java file
    @Test
    void getCourseNull() {

        assertEquals(null, courseService.getCourse("some course that is not offered"));
    }

}