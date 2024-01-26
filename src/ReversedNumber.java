//Write a java program to reverse a number using while loop

import java.util.Scanner;
public class ReversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed: "); //1234
        int num = sc.nextInt();

        int reversedNum = reverseNum(num);
        System.out.println("The reversed number is: " + num);
    }

    public static int reverseNum(int num){
        int reversedNumber = 0;
        while (num != 0){
            int digit = num % 10;   //digit = 4,3,2,1
            reversedNumber = reversedNumber * 10 + digit; //reversedNum = 4, 43, 432,4321
            num /= 10; // num = 123, 12, 1,0
        }
        return reversedNumber;
    }
}
