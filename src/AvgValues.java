//Write a java program to calculate the sum values of an array

import java.util.Scanner;
public class AvgValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int [size];

        System.out.println("Enter the numbers to be fit in the array: ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for (int nums : numbers){
            sum = sum + nums;
        }

        System.out.println("The sum of the numbers is: " + sum);

        double average = (double) sum / size;
        System.out.println("The average of the numbers is: " + average);

    }
}
