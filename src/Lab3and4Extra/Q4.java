package Lab3and4Extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList <Integer> uniqueNum = new ArrayList<>();

        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if (!numbers.contains(num)){
                numbers.add(num);
                uniqueNum.add(num);
            }
        }
        System.out.print("Output: ");
        for (Integer num : uniqueNum){
            System.out.print(num + " ");
        }
    }
}
