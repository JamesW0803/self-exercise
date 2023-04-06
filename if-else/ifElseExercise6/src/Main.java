import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character (A to Z): ");
        char c = sc.next().charAt(0);
        if (Character.isUpperCase(c)){
            System.out.println(c + " is an uppercase letter. ");
        }
        else if (Character.isLowerCase(c)){
            System.out.println(c + " is a lowercase letter. ");
        }
        else{
            System.out.println("Error... Please enter the character again...");
        }
    }
}