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
        courses.add(course);
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {   //TODO implement this method
        //iterate Course object from arrayList of courses
        //arrayList(courses) for each method

        for(Course course:courses) {
            //in the arrayList use getCode method
            //to check if it matches with the user's input(courseCode) use .equals
            if (course.getCode().equals(courseCode)) {
                //if it equals return true
                return true;
            } else {
                //if not equals return false
                return false;
            }
        }
        return false;

    }

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
