package Lab5;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        int value = sc.nextInt();

        MyStack <Integer> intStack = new MyStack<>();
        if (value >= 1){
            for (int i = 1; i <= value; i++){
                intStack.push(i);
            }
        }else{
            for (int i = 1; i >= value; i--){
                intStack.push(i);
            }
        }

        System.out.printf("The size of the stack: %d\n", intStack.getSize());

        while (!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
    }
}
