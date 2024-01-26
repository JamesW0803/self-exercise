package Lab7and8Extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("C:\\Users\\User\\Downloads\\lab7q3 (2).txt"));
        StringBuilder str = new StringBuilder();
        while (sc.hasNextLine()){
            str.append(sc.nextLine());
        }
        sc.close();
        System.out.println(str.toString());
        classifyProduct(str.toString());
    }

    public static void classifyProduct(String str){
        String [] tokens = str.split(" ");
        MyQueue <String> productCode = new MyQueue<>();
        MyQueue <String> emotions = new MyQueue<>();
        MyQueue <String> carType = new MyQueue<>();
        MyQueue <String> element = new MyQueue<>();
        MyQueue <String> fruit = new MyQueue<>();

        Set <String> checkDuplicateCode = new HashSet<>();

        for (int i = 0 ; i < tokens.length; i++){
            if (tokens[i].equals("P03")){
                emotions.enqueue(tokens[i+1]);
                if (!(checkDuplicateCode.contains(tokens[i]))){
                    checkDuplicateCode.add(tokens[i]);
                    System.out.println("Enqueue product code: " + tokens[i]);
                    productCode.enqueue(tokens[i]);
                }
            }else if (tokens[i].equals("P02")){
                carType.enqueue(tokens[i+1]);
                if (!(checkDuplicateCode.contains(tokens[i]))){
                    checkDuplicateCode.add(tokens[i]);
                    System.out.println("Enqueue product code: " + tokens[i]);
                    productCode.enqueue(tokens[i]);
                }
            }else if (tokens[i].equals("P04")){
                element.enqueue(tokens[i+1]);
                if (!(checkDuplicateCode.contains(tokens[i]))){
                    checkDuplicateCode.add(tokens[i]);
                    System.out.println("Enqueue product code: " + tokens[i]);
                    productCode.enqueue(tokens[i]);
                }
            }else if (tokens[i].equals("P09")){
                fruit.enqueue(tokens[i+1]);
                if (!(checkDuplicateCode.contains(tokens[i]))){
                    checkDuplicateCode.add(tokens[i]);
                    System.out.println("Enqueue product code: " + tokens[i]);
                    productCode.enqueue(tokens[i]);
                }
            }
        }

        System.out.print("Product code in queue: ");
        productCode.displayProduct();
        System.out.println();
        while (!productCode.isEmpty()){
            if (productCode.peek().equals("P03")){
                System.out.println("Product: " + productCode.dequeue());
                emotions.displayProduct();
                System.out.println();
            }else if (productCode.peek().equals("P02")){
                System.out.println("Product: " + productCode.dequeue());
                carType.displayProduct();
                System.out.println();
            }else if (productCode.peek().equals("P04")){
                System.out.println("Product: " + productCode.dequeue());
                element.displayProduct();
                System.out.println();
            }else if (productCode.peek().equals("P09")){
                System.out.println("Product: " + productCode.dequeue());
                fruit.displayProduct();
                System.out.println();
            }
        }
    }
}
