package com.generation.utils;

import com.generation.model.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrinterHelper
{

    private static Date birthDate;

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
        throws ParseException
    {
        System.out.println( "|-------------------------------------|" );
        System.out.println( "| . 1 Register Student                |" );
        System.out.println( "|-------------------------------------|" );
        System.out.println( "| Enter student name:                 |" );
        String name = scanner.next();
        System.out.println( "| Enter student ID:                   |" );
        String id = scanner.next();
        System.out.println( "| Enter student email:                |" );
        String email = scanner.next();
        DateFormat formatter = new SimpleDateFormat( "MM/dd/yyyy");
        boolean validDate = false;
        Date birthdate = null;
        while (!validDate) {
            System.out.println("| Enter birthdate in following format (mm/dd/yy) |");
            try {
                birthdate = formatter.parse(scanner.next());
                validDate= true;
            } catch (ParseException error) {
                System.out.println("Invalid birthdate!");
            }
        } ;
        // While loop with try and catch statement to catch wrong birthdate input
        System.out.println( "|-------------------------------------|" );
        Student student = new Student( id, name, email, birthdate );
        System.out.println( "Student Successfully Registered! " );
        System.out.println(student);
        return student;
    }
}
