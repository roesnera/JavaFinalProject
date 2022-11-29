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

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary() {
        //TODO implement
        System.out.println("Students Summary:");

        for (Student student: students.values() ){
            System.out.println(student.toString());
        }
//        Another way of doing, but creating unneccesary objects, method calls and also using the slow arraylist
//        for ( String key : students.keySet() )
//        {
//            Student student = students.get(key);
//            List<Course> courses = student.getCourses();
//            ArrayList<String> summary = new ArrayList<>();
//            summary.add(student.toString());
//            for (Course course:courses) {
//                //System.out.print(course.toString()+"  ");
//                summary.add(course.toString());
//            }
//            System.out.println(summary.toString());
//
//        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }

    public Map<String, Student> getStudents() {
        return students;
    }

}
