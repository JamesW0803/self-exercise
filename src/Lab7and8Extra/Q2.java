package Lab7and8Extra;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter transactions : ");
        String input = sc.nextLine();
        calTrans(1000, input);
    }

    public static void calTrans(int balance, String str) {
        String[] temp = str.split(" ");

        int initialBal = balance;
        MyQueue<String> letter = new MyQueue<>();

        for (int i=0; i< temp.length; i++) {
            if (temp[i].equals("D")) {
                letter.enqueue(temp[i]);
                balance += Integer.parseInt(temp[i+1]);
                letter.enqueue(temp[i+1]);
            } else if (temp[i].equals("W")){
                letter.enqueue(temp[i]);
                balance -= Integer.parseInt(temp[i+1]);
                letter.enqueue(temp[i+1]);
            }
        }
        letter.display();
        System.out.print("Final Balance: " + balance);
    }
}
