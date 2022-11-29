package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;


class StudentServiceTest {

    //Declare instances for tests
    Date date = new Date(12/12/1212);
    Date date2 = new Date(11/11/1111);
    Student student = new Student("1", "Makiko", "makiko@gmail.com", date);
    Student student2 = new Student("2", "Randy", "randyo@gmail.com", date2);
    StudentService studentService = new StudentService();

    //Only method's type that is not void can be tested. So, I created two  for find students below
    @Test
    void findStudent() {

        //Add the student in the students(Map)
        studentService.subscribeStudent(student);

        //Test the method
        assertEquals(studentService.findStudent(student.getId()).getId(), "1");
    }

    @Test
    void findStudent2() {
        //Add the student in the students(Map)
        studentService.subscribeStudent(student2);

        //Test the method
        assertEquals(studentService.findStudent(student2.getId()).getName(), "Randy");
    }

}