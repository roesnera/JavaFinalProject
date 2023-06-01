package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

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
        //TODO implement

        System.out.println( "Students:" );
        for ( String key : students.keySet() ) //key is student id number value is object 5
        {
            Student student = students.get( key );//returns object and places it in student
            System.out.println( student); //prints student
//            System.out.println(student.isAttendingCourse("INTRO-WEB-1")); //tests if student is enrolled to this course
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
