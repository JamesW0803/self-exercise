import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            boolean isPrime = true;
            System.out.println("Enter a positive number (Enter \"-1\" to quit the program): ");
            N = sc.nextInt();

            if(N <= 1){
                System.out.println("Please type a number larger than 1: ");
                continue;
            }

            if(isPrime(N)){
                System.out.println(N + " is a prime number. ");
            }
            else{
                System.out.println(N + " is not a prime number. ");
            }
        }while (N != -1);
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}