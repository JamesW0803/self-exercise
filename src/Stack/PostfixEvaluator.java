package Stack;


import java.util.Scanner;

public class PostfixEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Testing PostFix Evaluation: ");
        String input = scanner.nextLine();
        System.out.println(evaluatePostfix(input));
    }

    public static double evaluatePostfix(String postfix){
        MyStack <Double> stack = new MyStack<>();
        String [] tokens = postfix.split(" ");
        for (String token : tokens){
            if (isNumeric(token)){
                stack.push(Double.valueOf(token));
            }else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^")){
                Double operandTwo = stack.pop();
                Double operandOne = stack.pop();
                Double result = compute(operandOne, operandTwo, token);
                stack.push(result);
            }
        }
        return stack.peek();
    }

    private static boolean isNumeric(String token) {
        try{
            double d = Double.parseDouble(token);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    private static double compute(Double operandOne, Double operandTwo, String operator){

        return switch (operator) {
            case "+" -> operandOne + operandTwo;
            case "-" -> operandOne - operandTwo;
            case "*" -> operandOne * operandTwo;
            case "/" -> operandOne / operandTwo;
            case "^" -> Math.pow(operandOne, operandTwo);
            default -> 0;
        };
    }
}
