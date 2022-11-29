package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Student
    extends Person
    implements Evaluation {
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date birthDate) {
        super(id, name, email, birthDate);
    }

    public void enrollToCourse(Course course) {

        //TODO implement this method
//well this was a lot simpler than i was making it 🙄
   courses.add(course);

    }

    public void registerApprovedCourse(Course course) {
        approvedCourses.put(course.getCode(), course);
    }


    public boolean isAttendingCourse(String courseCode) {

        //TODO implement this method
        //use getCode method
        //loop over the list of courses to see if any match
        //if course code passed in as arg, is included in the course list
        // return true
        //if not  return false;
        int i = 0;

        while (i < courses.size()) {


            if (i == courses.indexOf(courseCode)) {
                return true;
            }

        }
        return false;
        // omg did i do it? not getting the red squiggles! would this work?



        //from adam's example:
        //i really need to get more comfortable with loops because i completely forgot about this type
      for(Course c : courses){
        if(c.getCode().equals(courseCode)){
            return true;
        }
        return false;



    }


    @Override
    public double getAverage(){

        return average;
    }

    @Override
    public String toString() {

        return "Student {" + super.toString() + "}"
    }

}