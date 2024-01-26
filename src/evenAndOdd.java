//Write a program to print even and odd numbers in an array

import java.util.Scanner;

public class evenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the values to be fit in the array: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("The even numbers in the array: ");
        printEven(numbers);

        System.out.println();

        System.out.println("\nThe odd numbers in the array: ");
        printOdd(numbers);
    }

    public static void printEven(int[] array){
        for (int num : array){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
    }

    public static void printOdd(int[] array){
        for (int num : array){
            if (num %2 != 0){
                System.out.print(num + " ");
            }
        }
    }
}
