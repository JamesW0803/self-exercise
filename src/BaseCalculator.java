import java.util.Scanner;

public class BaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the base from the user
        System.out.print("Enter the base (e.g., 7): ");
        int base = scanner.nextInt();

        // Validate that the base is greater than 1 and less than 11
        if (base < 2 || base > 10) {
            System.out.println("Base must be between 2 and 10.");
            return;
        }

        // Get the integer from the user
        System.out.print("Enter the integer to convert to binary representation: ");
        int number = scanner.nextInt();

        System.out.println("Binary representation using base " + base + " is: " + convertToBinary(number, base));
    }

    public static String convertToBinary(int number, int base) {
        StringBuilder binaryRepresentation = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            binaryRepresentation.insert(0, remainder);
            number /= base;
        }
        return binaryRepresentation.toString();
    }
}
