import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter any negative integer to quit the program...");
            int negative = sc.nextInt();

            if (negative < 0){
                break;
            }
            else {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();

                System.out.println("Enter the power: ");
                int pow = sc.nextInt();

                double output = Math.pow(num, pow);

                System.out.printf("The output of %d to the power of %d is: %.0f", num, pow, output);

                if (output % 2 == 0){
                    System.out.println("\nThe output is an even number.");
                }else{
                    System.out.println("\nThe output is not an even number.");
                }
            }
        }
    }
}