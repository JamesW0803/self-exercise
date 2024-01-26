package Lab5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to test: ");
        String input = sc.next();
        System.out.println("Does the string is a palindrome? " + isPalindrome(input));

    }

    public static boolean isPalindrome(String input){
        MyStack <Character> stack = new MyStack<>();
        for (int i = 0 ; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0 ; i < input.length(); i++){
            if (!stack.pop().equals(input.charAt(i))){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
