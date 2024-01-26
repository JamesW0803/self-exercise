package Lab5;


public class TestMyStack {
    public static void main(String[] args) {
        MyStack <Character> charStack = new MyStack<>();
        charStack.push('a');
        charStack.push('b');
        charStack.push('c');

        System.out.println(charStack.toString());
        System.out.println("Does element 'b' is in the stack? " + charStack.search('b'));
        System.out.println("Does element 'k' is in the stack? " + charStack.search('k'));

        System.out.println();

        MyStack <Integer> intStack = new MyStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println(intStack.toString());
        System.out.println("Does element '6' is in the stack? " + intStack.search(6));
    }
}
