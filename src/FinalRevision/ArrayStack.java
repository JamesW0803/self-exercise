package FinalRevision;


public class ArrayStack <E> {
    E[] elements;
    int size = 0;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity){
        elements = (E[]) new Object[capacity];
    }

    public ArrayStack(){
        this(10);
    }

    @SuppressWarnings("unchecked")
    public void push(E element){
        if (size == elements.length){
            E[] newArray = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
        elements[size ++] = element;
    }

    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public E peek(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size];
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
