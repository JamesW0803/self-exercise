import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four-digit number: ");
        int n = sc.nextInt();

        if (!(n > 999) || n > 9999){
            System.out.println(n + " is not a four-digit number.");
        }
        else{
            int fourthDigit = n % 10;
            int thirdDigit = (n / 10) % 10;
            int secDigit = (n / 100) % 10;
            int firstDigit = (n / 1000) % 10;

            if (firstDigit + secDigit == thirdDigit + fourthDigit){
                System.out.println("This is a lucky number.");
            }else{
                System.out.println("This is not a lucky number.");
            }
        }
    }
}