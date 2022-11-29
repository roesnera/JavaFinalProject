package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
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






    public void showSummary()
    {
        //TODO implement
        //at first i thought this was supposed to output a summary of the student, like their info and the course and average etc!
        //and then at the end of the day, i thought you said it was supposed to just print a list of the students
        //but my peers are thinking we are supposed to include the courses that each student signed up for?
        // but after puzzling over it for a long time, maybe that's not the case?
        // or maybe i just don't get it 😹

     System.out.println("Students Summary:" + students);

       //i added 3 students and when i 'Show Students Summary', it does show them
        // (but in an array rather than individually listed)
        //how to get it to list by student?
        //this is a lot of commenting


        //from adam's:
        System.out.println("Students: ");
    for(Students s: students.values()){
    System.out.println(s.toString());
        //getting error message "can not resolve symbol Students" 🤔
}

    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
