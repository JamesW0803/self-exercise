import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String normalStr = sc.nextLine();
        String reverse = " ";

        for (int i = normalStr.length() - 1; i >= 0; i--){
            reverse += normalStr.charAt(i) + " ";
        }
        System.out.println(reverse);
    }
}