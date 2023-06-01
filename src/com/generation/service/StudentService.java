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
            String studentStr = student.toString(); //convert the student into a string
            String newStr = new String();
            String courseStr = student.getCourses().toString(); //convert the course list into a string
            /*
            loop through the student string and add each character to the new string, once it reach the second last index,
            add a comma and followed by course string to the new string and end the string with the last index of the
            student string (}). Lastly, print out the new string
             */
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
