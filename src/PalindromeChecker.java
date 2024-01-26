//Write a java program to check if a number is a palindrome using while loop

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean palindrome = checkPalindrome(num);
        System.out.println("The number is a palindrome: " + palindrome);
    }

    public static boolean checkPalindrome(int num){
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum == originalNum;
    }
}
