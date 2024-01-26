//Write a java program to calculate the sum of the numbers in an array

import java.util.Scanner;
public class SumOfNumInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the numbers array: ");
        int size = sc.nextInt();
        int [] num = new int[size];

        System.out.println("Enter the number to fill the array");
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        int sum = 0;
        for (int nums : num){
            sum = sum + nums;
        }

        System.out.println("The sum of the numbers in the array is: " + sum);
    }
}
