import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = " ";

        while(true){
            System.out.println("Enter \"quit\" to quit the calculator. ");
            choice = sc.nextLine();
            sc.nextLine();
            if (choice.equalsIgnoreCase("quit")){
                break;
            }
            else{
                System.out.println("Enter num1 operator num2 (example: 1 + 2): ");

                double d1 = sc.nextDouble();
                char op = sc.next().charAt(0);
                double d2 = sc.nextDouble();

                if (op == '+'){
                    System.out.println((int) d1 + d2);
                }
                else if (op == '-'){
                    System.out.println((int) d1 - d2);
                }
                else if (op == '*'){
                    System.out.println((int) d1 * d2);
                }
                else if (op == '/'){
                    System.out.println(d1 / d2);
                }
                else{
                    System.out.println("Error...Please type the operators correctly...");
                }
            }
        }
    }
}


