package Stack;

import java.util.Scanner;

public class PalindromeChecker {
    static String reverse = " ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack <String> strStack = new MyStack<>();
        String[] strArray = new String [15];
        int count = 0;
        String input = " ";

        System.out.println("Enter the strings to be stored in the array: (Enter \"quit\" to stop the program)");
        input = sc.nextLine();
        while (!input.equals("quit")){
            strArray[count] = input;
            count ++;
            input = sc.nextLine();
        }

        System.out.println();
        System.out.println("The strings that you entered are: ");
        for (int i = 0 ; i < count; i++){
            System.out.print(strArray[i] + " ");
            strStack.push(strArray[i]);
        }

        System.out.println();
        System.out.println();

        while (!strStack.isEmpty()){
            String s = strStack.pop();
            if (isPalindrome(s)){
                System.out.println(s + " is a palindrome.");
            }else{
                System.out.println(s + " is not a palindrome.");
            }
        }
    }

    private static boolean isPalindrome(String s) {
        MyStack<Character> charStack = new MyStack<>();
        StringBuilder sb = new StringBuilder();
        reverse = "";
        for (int i = 0; i < s.length(); i++){
            charStack.push(s.charAt(i));
        }
        while (!charStack.isEmpty()){
            reverse = String.valueOf(sb.append(charStack.pop()));
        }
        return s.equals(reverse);
    }
}
