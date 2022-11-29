package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    //Keep track of the courses that each student registered.
    private final Map<String, ArrayList<Course>> enrolledStudents = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ))
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        //TODO implement
        System.out.println( "List of Students:" );

        //Enhanced for loop for the students
        for ( String key : students.keySet()) {
            Student student = students.get(key);
            List<Course> courseList = enrolledStudents.get(student.getId());

            //Print out the student information
            System.out.print(student);
            if (courseList != null) {
                System.out.println(courseList);
            } else {
                System.out.println("[{}]");
            }
            System.out.println();
        }
    }

    //Keeping track of the course for the student
    public void addEnrollStudents(String studentId, Course course) {


        if ( (enrolledStudents.containsKey( studentId ) ))
        {
            ArrayList<Course> courseList =  enrolledStudents.get(studentId);
            System.out.println("CourseList" + courseList);

            //For avoiding ConcurrentModificationException,used for loop
            boolean flag = false;
           for(int i = 0; i < courseList.size();  i++) {
                if (courseList.get(i).getCode().equals(course.getCode())) {
                    flag = true;
                }
            }
           if(!(flag)) {
               enrolledStudents.get(studentId).add( course );
           }
        }
        else {
            enrolledStudents.put( studentId, new ArrayList<>() );
            enrolledStudents.get(studentId).add( course );
        }

    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );

            //Keeping the information of enrolled course for the student
            addEnrollStudents(studentId, course);
        }
    }


}
