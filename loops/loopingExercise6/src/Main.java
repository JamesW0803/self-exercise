import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int numLength = String.valueOf(num).length();
        for (int i = 0; i < numLength; i++){
            sum += num % 10;
            num = num/10;
        }
        System.out.println("The sum of all integers in the number: " + sum);
    }
}