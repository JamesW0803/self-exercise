//Convert integer to string

import java.util.Scanner;
public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to be converted into string: ");
        int num = sc.nextInt();

        String str = Integer.toString(num);

        System.out.println("The converted string: " + str);
    }
}
