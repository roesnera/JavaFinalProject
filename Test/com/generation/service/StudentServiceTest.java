package com.generation.service;


import java.util.Date;
import com.generation.model.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentServ = new StudentService();


    @Test
    void subscribeStudent() {
        Student student1 = new Student("1","bob", "bob@email.com", new Date());
        studentServ.subscribeStudent(student1);
        Student student2 = studentServ.findStudent("1");
        assertEquals( student1, student2);
    }

    @Test
    void findStudent() {

        Student student = new Student("1","bob", "bob@email.com", new Date());
        studentServ.subscribeStudent(student);
        Student resp = studentServ.findStudent("1");
        assertEquals( student, resp);

    }

    @Test
    void showSummary() {
    }

    @Test
    void enrollToCourse() {
    }
}