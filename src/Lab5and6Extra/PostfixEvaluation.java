package Lab5and6Extra;

public class PostfixEvaluation {
    public static void main(String[] args) {
        System.out.println("23+4*5-: " + evaluatePostfix("2 3 + 4 * 5 -"));
    }

    public static int evaluatePostfix(String expression){
        MyStack <Integer> valueStack = new MyStack<>();
        String [] tokens = expression.split(" ");
        for (String token : tokens){
            if (isNumeric(token)){
                valueStack.push(Integer.valueOf(token));
            }else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                Integer operandTwo = valueStack.pop();
                Integer operandOne = valueStack.pop();
                int result = compute(operandOne, operandTwo, token);
                valueStack.push(result);
            }
        }
        return valueStack.peek();
    }

    private static int compute(Integer operandOne, Integer operandTwo, String token) {
        return switch (token) {
            case "+" -> operandOne + operandTwo;
            case "-" -> operandOne - operandTwo;
            case "*" -> operandOne * operandTwo;
            case "/" -> operandOne / operandTwo;
            default -> 0;
        };
    }

    private static boolean isNumeric(String token) {
        try{
            int d = Integer.parseInt(token);
        }catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
