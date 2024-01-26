package Lab3and4Extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i ++){
            int input = sc.nextInt();
            list.add(input);
        }

        int sum = 0;
        for (Integer number : list){
            sum += number;
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}
