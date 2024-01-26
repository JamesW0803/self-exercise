package Lab5and6Extra;

import java.util.concurrent.atomic.AtomicStampedReference;

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "((((A-B)+((M^N)*(O+P)))-((Q/(R^S))*T))+Z)";
        System.out.println(toPostfix(exp));
    }

    public static String toPostfix(String str) {
        StringBuilder sb = new StringBuilder();
        MyStack<Character> stack = new MyStack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetterOrDigit(c)) {  // if isLetterorDigit, add to output string
                sb.append(c);                    // important
            } else if (c == '(') {               // if ( push into stack
                stack.push(c);
            } else if (c == ')') {               // if ) pop stack until (is found, discard (

                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());     // add the content of stack into output string
                }

                stack.pop();    // remove the last element in stack which is ( that will not be in the output string

            } else { // it is an operator: check precedence, if current is smaller then pop, else push
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) { // if the current operator's precedence is lower or equal
                    sb.append(stack.pop()); // add the content of stack to output string
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {      // pop to remove all content left, if found ( return invalid
            if (stack.peek() == '(') {          // important
                return "invalid operation";     // important
            }
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    private static int precedence(char c) {
        if (c == '+' || c == '-'){
            return 1;
        }else if (c == '*' || c == '/'){
            return 2;
        }else if (c == '^'){
            return 3;
        }else{
            return 0;
        }
    }
}
