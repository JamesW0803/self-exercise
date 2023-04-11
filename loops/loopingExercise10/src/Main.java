import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i ++, j --){
            if (str.charAt(i) == str.charAt(j)){
                continue;
            }
            isPalindrome = false;
            break;
        }

        System.out.println(isPalindrome? "Palindrome" : "Not Palindrome");

    }
}