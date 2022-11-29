package com.generation.model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();
    //temp holds the courses each student is enrolled
    public final List<String> temp = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }
    //getter method to return the enrolled courses to display in student summary
    public List<String> getTemp(){
        return temp;
    }
    public void enrollToCourse( Course course )
    {
        //check if student is already enrolled in course
        if(!isAttendingCourse(course.getCode())) {
            //add the user's input course into the arrayList course
            courses.add(course);
            //add the course into the arrayList
            temp.add(String.valueOf(course));
        } else {
            System.out.println("Student is already enrolled in course");
        }
    }


    public boolean isAttendingCourse( String courseCode ) {
        //iterate through the courses arrayList that consists of Course object.
        // IE: [Course{Code,Name,Credits,Module},Course{Code,Name,Credits,Module},Course{Code,Name,Credits,Module}]
        //for each element(temp) in arrayList(courses)
        for (Course temp : courses) {
           //use getCode method to get the course code of each element in the arrayList
           //.equals check if it matches with the user's input(courseCode)
            if (temp.getCode().equals(courseCode)) {
                //return true if it equals
                return true;
               //return false if not found
            }
        }
        return false;
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
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
