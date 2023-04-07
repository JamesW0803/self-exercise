import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int [100];
        int count = 0;

        System.out.println("Enter positive integers (Enter a negative integer to stop): ");
        int input = sc.nextInt();
        while (input >= 0){
            array [count] = input;
            count ++;
            input = sc.nextInt();
        }

        System.out.print("The numbers that you entered are: ");
        for(int i = 0; i < count; i++){
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < count; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("\nThe maximum number in the list: " + max);
        System.out.println("The minimum number in the list: " + min);
    }
}