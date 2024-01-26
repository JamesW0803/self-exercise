package Lab5and6Extra;

public class MyStack <E> {
    private E [] elements = (E[]) new Object[10];
    private int size = 0;
    public MyStack(){}

    @SuppressWarnings("unchecked")
    public MyStack(int capacity){
        elements = (E[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return elements[size - 1];
    }

    @SuppressWarnings("unchecked")
    public void push(E element){
        if (size == elements.length){
            E [] newArray = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public void pushMany(String input){
        String [] tokens = input.split(",");
        for (String token : tokens) {
            push((E) token);
        }
    }

    public E pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    @SuppressWarnings("unchecked")
    public void popAll(){
        StringBuilder sb = new StringBuilder("There are " + size + " items in the stack. Removing... \n");
        for (int i = elements.length - 1; i >= 0; i--){
            if (elements[i] == null){
                continue;
            }
            sb.append("Removing ").append(elements[i]).append("..\n");
        }
        elements = (E[]) new Object[10];

        System.out.println(sb.toString());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0 ; i < elements.length; i++){
            sb.append(elements[i]);
            if (i < elements.length - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int getSize (){
        return size;
    }
}
