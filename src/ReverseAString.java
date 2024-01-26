//Write a java program to reverse a string


import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String str = sc.nextLine();

        StringBuilder nstr = new StringBuilder();

        System.out.println("Original Word: " + str);

        for (int i = str.length() - 1; i >= 0; i--){
            nstr.append(str.charAt(i));
        }
        System.out.println("Reversed Word: " + nstr);

    }
}
