package Lab5;

public class MyStackArray <E> {
    private E[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public MyStackArray(int capacity){
        elements = (E[]) new Object[capacity];
    }

    public void push(E o){
        if (size == elements.length){
            @SuppressWarnings("unchecked")
            E[] newArray = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
        elements[size ++] = o;
    }

    public E pop(){
        if(isEmpty()){
            return null;
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public int getSize(){
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++){
            sb.append(elements[i]);
            if (i < size - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean search(E o){
        for (int i = 0 ; i < size; i++){
            if (elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }
}
