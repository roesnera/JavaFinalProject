package com.generation.model;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {

        if(!isAttendingCourse(course.getCode()))
        {
            courses.add(course);
        }
        else{

            System.out.println("Student already Enrolled");
        }


    }



    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        for(Course c: courses) {
            if (c.getCode().equals(courseCode)) {
                return true;

            }
        }


        return false;

    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
