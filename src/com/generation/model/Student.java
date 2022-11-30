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

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        //to add courses to the list Course
        if(!isAttendingCourse(course.getCode())) {
        this.courses.add(course); }
        else {
            System.out.println("The Student is already enrolled in the course.");
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode ) {

        //TODO implement this method

        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

        //return true if the courseCode correspond to any course on the List,
        // go to the Course class, use the loop, if it matches - return true;



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
