package com.generation.service;

        import java.util.Scanner;
        import javax.swing.JFrame;
        import javax.swing.JOptionPane;
public class Login extends Access {

    public Login() {
    }

    public void loginMenu(Access registeredUser) {

        Scanner input = new Scanner(System.in);

        System.out.println("**********************");

        System.out.println();

        System.out.println(" Login".toUpperCase());

        System.out.println("**********************");

        System.out.println("Enter metric number: ");

        String metric = input.nextLine();

        System.out.println("Enter last four digit of IC number: ");

        int ic = Integer.parseInt(input.nextLine());

        Access aUser = new Access(metric, ic);

        this.checkLogin(aUser, registeredUser);
    }

    public void checkLogin(Access aUser, Access userRecord) {

        if (aUser.getUsername().equals(userRecord.getUsername()) && aUser.getPassword() == userRecord.getPassword()) {

            JFrame newFrame = new JFrame();

            JOptionPane.showMessageDialog(newFrame, "Welcome " + aUser.getUsername() + "!");

        }

    }

}



