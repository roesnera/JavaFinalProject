package com.generation.utils;

import com.generation.model.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrinterHelper {

    public static void showMainMenu() {
        System.out.println("|-------------------------------|");
        System.out.println("| Welcome to StudentGen         |");
        System.out.println("|-------------------------------|");
        System.out.println("| Select 1 option:              |");
        System.out.println("| . 1 Register Student          |");
        System.out.println("| . 2 Find Student              |");
        System.out.println("| . 3 Enroll Student to Course  |");
        System.out.println("| . 4 Show Students Summary     |");
        System.out.println("| . 5 Show Courses Summary      |");
        System.out.println("| . 6 Exit                      |");
        System.out.println("|-------------------------------|");
    }

    public static Student createStudentMenu(Scanner scanner)
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
        // set date format to mm/dd/yyyy
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        // declare next input as dob
        String dob = scanner.next();
        // declare isValidDate to the return the value of isValidFormat method(if the date format is correct)
        boolean isValidDate = isValidFormat(dob);
        // while the format is not true, loop until the user input the correct format
        while (!isValidDate){
            System.out.println("| Enter student birth date(mm/dd/yyyy)|");
            // retaking the user for DOB again
            dob = scanner.next();
            // resetting value on isValidDate and stops when true.
            isValidDate = isValidFormat(dob);
        }
        // declare birthDate as the user's input into a DateFormat
        Date birthDate = formatter.parse(dob);
        System.out.println("|-------------------------------------|");
        Student student = new Student(id, name, email, birthDate);
        System.out.println("Student Successfully Registered! ");
        System.out.println(student);
        return student;
    }

    public static boolean isValidFormat(String dob) {
        try {
            // set the expected date format
            DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            // check if date is matches the format
            formatter.parse(dob);
            return true;
        } catch (Exception e) {
            // throw error message if format is not matched
            System.out.println("Wrong Date Format, Error: " +e.getMessage());
            return false;
        }
    }
}
