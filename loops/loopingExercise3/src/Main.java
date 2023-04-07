import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Using for loop... ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num/2; i ++){
            if (num % i == 0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nTotal: " + sum);

        System.out.println();
        System.out.println();

        System.out.println("Using while loop... ");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int i = 1;
        int sum1 = 0;
        while(i <= num/2){
            if (num % i == 0){
                System.out.print(i + " ");
                sum1 += i;
            }
            i++;
        }
        System.out.println("\nTotal: " + sum1);
    }
}