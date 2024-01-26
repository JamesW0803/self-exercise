package Lab5and6Extra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HTMLChecker {
    public static void main(String[] args) throws FileNotFoundException{
        String currentFile = "C:\\Users\\User\\Downloads\\sample3 (1).txt";
        try{
            Scanner sc = new Scanner(new FileInputStream(currentFile));
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("\nIs this html file correct? " + checkHTML(currentFile));
    }

    private static boolean checkHTML(String currentFile) {
        try{
            Scanner sc = new Scanner(new FileInputStream(currentFile));
            String first = sc.nextLine();

            MyStack <String> stack = new MyStack<>();
            while (sc.hasNextLine()){
                String input = sc.nextLine();
                char [] tokens = input.toCharArray();

                for (int i = 0 ; i < tokens.length; i++){
                    if (tokens [i] == '<' && tokens [i+1] != '/'){
                        StringBuilder start = new StringBuilder();
                        i++;
                        while (tokens[i] != '>'){
                            start.append(tokens[i++]);
                        }
                        System.out.println("Pushing into stack: " + start.toString());
                        stack.push(start.toString());
                        System.out.println("Current stack: " + stack.toString() + "\n");
                        System.out.println("current i " + i);
                    }
                    if (tokens[i] == '<' && tokens[i+1] == '/'){
                        System.out.println("tokens[i]: " + tokens[i] + " tokens[i+1]: " + tokens[i+1]);
                        StringBuilder end = new StringBuilder();
                        i += 2;
                        while (tokens[i] != '>'){
                            end.append(tokens[i++]);
                        }
                        System.out.println("Found an ending tag: " + end);
                        String start = stack.pop();
                        System.out.println("end: " + end + " pop: " + start);

                        if (!start.contentEquals(end)){
                            System.out.println("Error: " + start + ", " + end);
                            return false;
                        }
                        System.out.println("The ending tag is correct");
                        System.out.println("Current stack: " + stack.toString() + "\n");
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
