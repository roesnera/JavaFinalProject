package com.generation.model;

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


    public void enrollToCourse(Course course )
    {
        //TODO implement this method
        if(!(isAttendingCourse(course.getCode()))) {
            //Initially I did correctly. I overthought add all registered courses to approvedCourses.
            //Modified back again
            courses.add(course);

            //Used for isAttendingCourse
            registerApprovedCourse(course);
        }
        else {
            System.out.println("The student has been enrolled");
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        if(approvedCourses.containsKey(courseCode)) {
            return true;
        }
        else {
            return false;
        }

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
