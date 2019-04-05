package com.company;

//### Task 1: Grand opening!
//
//        It is the first day of your new business. Time to do a grand opening! Sadly the robot that you hired to do meet-and-greet is broken. The main module is missing and it is up to you to write the core functionality and save the opening ceremony.
//
//Create an application that:
//        - greets the user and asks for their name
//        - politely echoes the user's name back, and invites them into the opening ceremony

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello guest, what is your name?");
        String name = sc.next();
        System.out.println("Thank you, " + name + ", we invite you to the opening ceremony!");
        }
}
