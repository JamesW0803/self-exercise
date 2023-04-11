import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= n - i; j ++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Updated part: ");
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= n - i; j ++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i - 1; k ++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}