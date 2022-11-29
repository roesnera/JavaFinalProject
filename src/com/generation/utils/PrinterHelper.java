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


    //method return true if the date is "MM/dd/yyyy" or false id is not
    public static boolean itsDate(String dateText){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dateText);
            return true;
        } catch (Exception e) {
            System.err.println("Error--> for entering the date use : MM/dd/YYYY");
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static Student createStudentMenu( Scanner scanner )
        throws ParseException {
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
        String dateText = scanner.next();
        while(!itsDate(dateText)){
            System.out.println("| Enter student birth date(mm/dd/yyyy)|");
            dateText = scanner.next();
        }
        Date birthDate = formatter.parse( dateText);

        System.out.println( "|-------------------------------------|" );
        Student student = new Student( id, name, email, birthDate );
        System.out.println( "Student Successfully Registered! " );
        System.out.println(student);
        return student;
    }

}
