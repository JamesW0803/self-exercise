import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String s = "12345";
        Scanner sc = new Scanner(System.in);
        int len = s.length();
        String rev = "";

        for (int i = len - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);

    }
}
