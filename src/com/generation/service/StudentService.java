package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();


    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        // shows the list of all students;
        System.out.println("Students: ");
        for (Student student : students.values()) {
        System.out.println(student.toString());
    }
        //or
       // System.out.println(List.of(students));

    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
