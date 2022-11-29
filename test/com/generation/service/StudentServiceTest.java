package com.generation.service;
import com.generation.model.Student;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentServiceTest {
    StudentService studentService = new StudentService();
    Student student1 = new Student("1","Tom","tom@abc.com",new Date(11/11/1111));
    Student student2 = new Student("2","Harry","harry@abc.com",new Date(11/11/1111));

//
    @Test
    void findStudent() {
        studentService.subscribeStudent(student1);
        assertEquals(student1,studentService.findStudent("1"));
    }

    @Test
    void getStudents() {
        Map<String, Student> students = new HashMap<>();
        students.put("1", student1);
        students.put("2", student2);

        studentService.subscribeStudent(student1);
        studentService.subscribeStudent(student2);
        assertEquals(students,studentService.getStudents());

    }
    @Test
    void findStudentNull() {

        assertEquals(null,studentService.findStudent(""));
    }


}