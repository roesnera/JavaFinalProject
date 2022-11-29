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
            //find all usages of showSummary method to see where
            //--it's being used  -- right-click on showSummary, find usages
            //needs to do the same thing as the courseService class -- EXAMPLE BELOW
//show summary of enrolled students
    //................................................
//Yay!! 9:16pm - small piece figured out!
    {
        System.out.println("Student Roster:");
        for (String key : students.keySet()) {
            Student student = students.get(key);
            System.out.println(student);
        }
//this part not working
                System.out.println( "Enrolled to Course" );
                for ( String key : students.keySet() )
                {
                    List<Course> courses = enrollToCourse.get( key );
                    System.out.println( "Enrolled in course " + key + ": " );
                    for ( Course course : courses )
                    {
                        System.out.println( course );
                    }
                }
            }
// .................................................

        //TODO implement



    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
