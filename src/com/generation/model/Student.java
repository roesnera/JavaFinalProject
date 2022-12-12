package com.generation.model;

import java.sql.SQLOutput;
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
    //Student class instance field courses assigned to a new array list
    private final Map<String, Course> approvedCourses = new HashMap<>();
    private Course course;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void enrollToCourse(Course course )
    {
        if (!isAttendingCourse(course.getCode())) {
            courses.add(course);
        }
        else {
            System.out.println("Student previously enrolled in course, enter different course.");
        }
        //Method that will add course objects to the instance field courses from above array list.
        // Implementing conditional statement to prevent double enrollment with else sout message
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        for (Course c : courses) {
            if (c.getCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
        //Boolean method that will return true if parameter courseCode is true for student with the argument that will be passed into it
        //Create enhanced for loop/for each loop that will loop over entry of courses from courses instance field array list above
        //Getting code of Course c to check if it equals to the argument that was passed to courseCode parameter
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
