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
        //this.courses.add(course);
        registerApprovedCourse(course);
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method

        //Use for loop to check if the courses arraylist's course code matches to the parameter course.
        for(String courseId : approvedCourses.keySet())
        for(int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getCode().equals(courseCode) ) {
                System.out.println(courses.get(i).getCode());
                return true;
            }
        }

        //If it does not match, return false
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
