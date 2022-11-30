package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private final Map<String, Student> students = new HashMap<>();


    public void subscribeStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student findStudent(String studentId) {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }
    public void showSummary()
    {
        // implement students values to showSummary
        System.out.println("Registered Student: ");
        for(String key: students.keySet())
        {
            Student student = students.get( key );
            System.out.println(student.toString());
    //TODO implement
        }
    }




    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
