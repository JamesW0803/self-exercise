package Lab6;

public class Q2 {
    public static void main(String[] args) {
        String input = "noon";
        System.out.printf("Is %s a palindrome? %b\n", input, isPalindrome(input));

        input = "eve";
        System.out.printf("Is %s a palindrome? %b\n", input, isPalindrome(input));

        input = "fifa";
        System.out.printf("Is %s a palindrome? %b\n", input, isPalindrome(input));

        input = "radars";
        System.out.printf("Is %s a palindrome? %b\n", input, isPalindrome(input));
    }

    public static boolean isPalindrome(String input){
        MyQueue <Character> queue = new MyQueue<>();
        for (int i = input.length() - 1; i >= 0; i--){
            queue.enqueue(input.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0 ; i < input.length(); i++){
            if (!queue.dequeue().equals(input.charAt(i))){
                return false;
            }
        }
        return isPalindrome;
    }
}
