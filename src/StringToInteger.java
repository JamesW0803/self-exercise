//Convert a string to an integer

import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int result = Integer.parseInt(str);

        System.out.println("The converted integer: " + result);
    }
}
