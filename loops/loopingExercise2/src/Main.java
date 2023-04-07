import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Using for loop...");
        int sum = 0, sum1 = 0, sum2 = 0;
        for ( ; true ; ){
            System.out.print("Enter a number: ");
            sum += sc.nextInt();
            if (sum >= 100)
                break;
        }
        System.out.println("Done: " + sum);

        System.out.println();
        System.out.println();

        System.out.println("Using while loop...");
        while(true){
            System.out.print("Enter a number: ");
            sum1 += sc.nextInt();
            if (sum1 >= 100)
                break;
        }
        System.out.println("Done: " + sum1);

        System.out.println();
        System.out.println();

        System.out.println("Using do-while loop...");
        do{
            System.out.print("Enter a number: ");
            sum2 += sc.nextInt();
        }while(sum2 <= 100);

        System.out.println("Done: " + sum2);
    }
}