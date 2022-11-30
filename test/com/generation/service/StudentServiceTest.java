package com.generation.service;

import org.junit.jupiter.api.Test;
import com.generation.model.Student;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    public StudentService studentService = new StudentService();

    @Test
    public void subscribeStudent() {
        Student nicole = new Student("1", "Nicole", "emaile@email.com", null);
        studentService.subscribeStudent(nicole);
//        assertEquals(nicole, nicole);
        assertTrue(true);
    }

    @Test
    public void findStudent() {
        Student nicole = studentService.findStudent("");
        assertNull(nicole);

    }
}

