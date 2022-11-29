package com.generation.model;

import java.util.*;

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
        if(! isAttendingCourse(course.getCode())) {
            this.courses.add(course);
            System.out.println( "Student with ID: " + super.getId() + " enrolled successfully to " + course.getCode() );
        }
        else{
            System.out.println(super.getId() +" already enrolled in  course " + course.getCode());
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


//    public List<Course> getCourses() {
//        return courses;
//    }

    public Map<String, Course> getApprovedCourses() {
        return approvedCourses;
    }

    public boolean isAttendingCourse(String courseCode )
    {
        //TODO implement this method
        for(Course courseList : courses) {
            if(Objects.equals(courseList.getCode(), courseCode)){
                System.out.println("Already  attending course  ");
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
        return "Student {" + super.toString() + ","+ courses.toString() +"}";
    }
}
