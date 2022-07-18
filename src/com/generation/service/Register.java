package com.generation.service;

        import java.util.Scanner;
        import javax.swing.*;
        import profile.Login;
public class Register {
    private String userName;
    public Register(){
    }
    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("******************************");

        System.out.println();

        System.out.println(" Register".toUpperCase());

        System.out.println("******************************");

        System.out.println("Enter metric number: ");

        String metric = input.nextLine();

        System.out.println("Enter last four digit of IC number: ");

        int ic = Integer.parseInt(input.nextLine());

        Access aUser = new Access(metric, ic);

        this.readContact(input, aUser);
    }
    public void readContact(Scanner input, Access aUser) {
        profile []contacts = new Profile[2];

        for (int i = 0; i < 2; i++) {

            System.out.println("Enter emergency contact person " + (i + 1) + " : ");

            Scanner inPut;
            String name = input.nextLine();

            System.out.println("Enter emergency contact person " + (i + 1) + " phone number(digit only) : ");

            int number = Integer.parseInt(input.nextLine());

            contacts[i] = new Profile(name, number);
        }
        this.successMessage(aUser, contacts);
    }

    public void successMessage(Access newUser, profile[] contacts) {

        JFrame newFrame = new JFrame();

        JOptionPane.showMessageDialog(newFrame, "Successfully registered. \n\n Emergency contact 1 : " + contacts[0].getName() + ", " + contacts[0].getContact() + "\n Emergency contact 2 :" + contacts[1].getName() + ", " + contacts[1].getContact() + "\n\n Proceed to login");
        Login login = new Login();
        login.loginMenu(newUser);
    }
    public void setUsername(String username) {
        this.userName = username;
    }
    public int getPassword() {
        int password;
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
}


