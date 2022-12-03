package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
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
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            String studentStr = student.toString();
            String newStr = new String();
            String courseStr = student.getCourses().toString();
            for(int i = 0; i < studentStr.length(); i++) {
                newStr += studentStr.charAt(i);
                if(i == studentStr.length() - 2) {
                    newStr += ", " + courseStr;
                }

            }
            System.out.println(newStr);
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
