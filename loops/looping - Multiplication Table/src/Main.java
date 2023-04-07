import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter the number range for the multiplication table: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }


    }
}