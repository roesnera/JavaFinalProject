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

    public void enrollToCourse( Course course ) {

        // ADD a new course into the course instance
        //TODO implement this method
        if(course.getCode().equals(courses)) {
            System.out.println("Course already exists");
        } else {
            courses.add(course);
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

//return true if student is attending class
    public boolean isAttendingCourse( String courseCode ) {
        //TODO implement this method
        for (Course cour : courses){
            if (cour.getCode().equals(courseCode)) {
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
