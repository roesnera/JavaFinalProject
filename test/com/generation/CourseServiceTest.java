package com.generation;

import com.generation.model.Module;

import com.generation.model.Course;

import com.generation.service.CourseService;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseServiceTest {
    Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
            "Introductory module for the generation technical programs" );
    Course c = new Course("INTRO-CS-1", "Introduction to Computer Science",9, module);
    CourseService cs = new CourseService();

   @org.testng.annotations.Test
    public void getCourse(String courseCode){
        Course code = cs.getCourse(courseCode);
        assertTrue(code.equals("INTRO-CS-1"));

    }

    @org.junit.jupiter.api.Test
    public void registerCourse(Course course){
        registerCourse(c);
        assertTrue(c.getCode().equals("INTRO-CS-1"));
    }

}
