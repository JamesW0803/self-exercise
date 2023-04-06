/*

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Welcome to Loan Eligibility Checker..." +
                    "\nThe data required are listed below: " +
                    "\n1. Name of the student" +
                    "\n2. Age of the student" +
                    "\n3. Marks in academics obtained by the student" +
                    "\nType any character or words to continue..." +
                    "\nEnter \"quit\" to quit the program...");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Enter your name: ");
                String name = sc.nextLine();
                sc.nextLine();

                System.out.println("Enter your age: ");
                int age = sc.nextInt();

                System.out.println("Enter your marks in academics: ");
                int mark = sc.nextInt();

                if (age >= 17 && age <= 21) {
                    if (mark >= 80) {
                        System.out.println("Congrats! You are eligible to get the student loans!");
                    } else {
                        System.out.println("You are not eligible to get the student loans...");
                    }
                } else {
                    System.out.println("You are not eligible to get the student loans...");
                }
            }
        }
    }
}