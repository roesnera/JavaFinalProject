package com.generation.utils;

import com.generation.model.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrinterHelper
{

    public static void showMainMenu(){
        System.out.println( "|-------------------------------|" );
        System.out.println( "| Welcome to StudentGen         |" );
        System.out.println( "|-------------------------------|" );
        System.out.println( "| Select 1 option:              |" );
        System.out.println( "| . 1 Register Student          |" );
        System.out.println( "| . 2 Find Student              |" );
        System.out.println( "| . 3 Enroll Student to Course  |" );
        System.out.println( "| . 4 Show Students Summary     |" );
        System.out.println( "| . 5 Show Courses Summary      |" );
        System.out.println( "| . 6 Exit                      |" );
        System.out.println( "|-------------------------------|" );
    }

    public static Student createStudentMenu( Scanner scanner )
    {
            System.out.println("|-------------------------------------|");
            System.out.println("| . 1 Register Student                |");
            System.out.println("|-------------------------------------|");
            System.out.println("| Enter student name:                 |");
            String name = scanner.next();
            System.out.println("| Enter student ID:                   |");
            String id = scanner.next();
            System.out.println("| Enter student email:                |");
            String email = scanner.next();
            System.out.println("| Enter student birth date(mm/dd/yyyy)|");
            DateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
            //TODO validate date format and catch exception to avoid crash
            //Initialize the birthday
            Date birthDate = null;

            //While the invalid format is added, birthDate is null
            while(birthDate == null) {
                try {
                    birthDate = formatter.parse(scanner.next());
                } catch (ParseException e) {
                    System.err.println("ParseException: " + e.getMessage());
                    System.out.println("| Enter student birth date(mm/dd/yyyy)|");
                }
            }
            Student student = new Student(id, name, email, birthDate);
            System.out.println("|-------------------------------------|");
            System.out.println("Student Successfully Registered! ");
            System.out.println(student);
            return student;
    }
}
