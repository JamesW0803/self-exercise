//check if a string is palindrome

import java.util.Scanner;
public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome){
            System.out.println("The string is a palindrome. ");
        }else{
            System.out.println("The string is not a palindrome. ");
        }

    }

    public static boolean isPalindrome (String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
