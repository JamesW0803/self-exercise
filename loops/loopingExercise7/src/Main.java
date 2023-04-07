import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number position of the Fibonacci number: ");
        int pos = sc.nextInt();

        int result = 0;
        int pos1 = 1;
        int pos2 = 1;
        for (int i = 1; i <= pos - 2; i++){
            result = pos1 + pos2;
            pos1 = pos2;
            pos2 = result;
        }
        System.out.println("The number at " + pos + "th position: " + result);
    }
}