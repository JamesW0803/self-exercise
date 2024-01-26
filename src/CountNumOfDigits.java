//Write a java program count the number of digits of the number using while loop

import java.util.Scanner;

public class CountNumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        System.out.println("The number of digits in " + num + " is: " + count);

        sc.close();
    }

    public static int countDigits(int num){
        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            num /= 10;
            count ++;
        }

        return count;
    }
}
