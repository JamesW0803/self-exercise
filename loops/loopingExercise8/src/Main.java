import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}