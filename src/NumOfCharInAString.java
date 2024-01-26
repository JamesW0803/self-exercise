//Write a program to count the number of time a character repeated in a string

import java.util.Scanner;
public class NumOfCharInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count ++;
            }
        }

        System.out.println("The number of time the character " + c + " appeared in the string " + str + ": " + count);
    }
}
