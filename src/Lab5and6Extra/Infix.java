package Lab5and6Extra;

public class Infix {
    public static void main(String[] args) {
        String expression = "23+4*5-";
        System.out.println("Postfix to Infix: " + postfixToInfix("23+4*5-"));
    }

    public static String postfixToInfix(String expression) throws IllegalArgumentException{
        MyStack <String> stack = new MyStack<>();
        for (int i = 0 ; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                stack.push(Character.toString(ch));
            }else if (isOperator(ch)){
                if (stack.getSize() < 2){
                    throw new IllegalArgumentException("Invalid postfix expression: Insufficient operands for operator '" + ch + "'");
                }
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op2 + ch + op1 + ")");
            }else{
                throw new IllegalArgumentException("Invalid character in postfix expression: '"+ ch + "'");
            }
        }
        if (stack.getSize() != 1){
            throw new IllegalArgumentException("Invalid postfix expression: Too many operands");
        }
        return stack.pop();
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
