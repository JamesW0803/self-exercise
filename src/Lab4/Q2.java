package Lab4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
            SList<String> namelist = new SList<>();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your student name list. Enter 'n' to end.");
            String in;
            do {
                in = sc.nextLine();
                namelist.add(in);
            } while(!in.equals("n"));
            namelist.removeElement("n");

            System.out.println("\nYou have entered the following students' name:");
            namelist.printList();

            System.out.printf("\nThe number of students entered is: %d\n", namelist.getSize());

            System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
            String confirm = sc.nextLine();
            if (confirm.equals("r")){
                System.out.println("Enter the existing student name that you want to rename:");
                String oldname = sc.nextLine();
                System.out.println("Enter the new name:");
                String newname = sc.nextLine();

                namelist.replace(oldname, newname);

                System.out.println("\nThe new student list is:");
                namelist.printList();
            }

            System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
            confirm = sc.nextLine();
            if (confirm.equals("y")){
                System.out.println("Enter a student name to remove:");
                String oldname = sc.nextLine();
                namelist.removeElement(oldname);

                System.out.printf("\nThe number of updated students entered is: %d\n", namelist.getSize());
                System.out.println("The updated student list is:");
                namelist.printList();
            }

            System.out.println("\nAll student data camptured complete. Thank you!");
            sc.close();
        }
}
