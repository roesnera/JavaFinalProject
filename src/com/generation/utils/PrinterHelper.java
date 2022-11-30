package com.generation.utils;

import com.generation.model.Student;

import java.sql.SQLOutput;
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

        // format set date as MM/dd/yyyy
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        // input student's date of birth
        boolean toValidDate = false;
        Date birthDate = null;

        /* TODO validate date format and catch exception to avoid crash */

        // input try...catch and return exception
        while(!toValidDate) {


            try {
                birthDate = formatter.parse(scanner.next());
                toValidDate = true;
            } catch (ParseException e) {
                System.out.println("Invalid Date!");
                System.out.println("| Enter valid date format (mm/dd/yyyy)|");
            }
        }
            System.out.println("|-------------------------------------|");
            Student student = new Student(id, name, email, birthDate);
            System.out.println("Student Successfully Registered! ");
            System.out.println(student);
            return student;

        }
    }


