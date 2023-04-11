import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Updated question: ");
        System.out.println("Enter a positive number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (i == 1 || i == n){
                for (int j = 1; j <= n; j++){
                    System.out.print("*");
                }
            }
            else{
                for (int j = 1; j <= n; j++){
                    if (j == 1 || j == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


    }
}