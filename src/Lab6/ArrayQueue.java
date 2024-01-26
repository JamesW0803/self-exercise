package Lab6;

public class ArrayQueue <E> {
    private E[] elements;
    private int size = 0;
    private int front = 0;
    private int rear = -1;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity){
        elements = (E[]) new Object[capacity];
    }

    public ArrayQueue(){
        this(10);
    }

    public void enqueue(E e){
        if (size == elements.length){
            expandQueue();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = e;
        size ++;
    }

    public E dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        E element = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size -- ;
        return element;
    }

    public E getElement(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return elements[(front + index) % elements.length];
    }

    public E peek(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty. ");
        }
        return elements[front];
    }

    public int getSize(){
        return size;
    }

    public boolean contains(E e){
        for (int i = 0; i < size; i++){
            if (getElement(i).equals(e)){
                return true;
            }
        }
        return false;
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

    private boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void expandQueue() {
        int newCapacity = elements.length * 2;
        E [] newArray = (E[]) new Object [newCapacity];
        for (int i = 0 ; i < size; i++){
            newArray[i] = elements[(front + i) % elements.length];
        }
        elements = newArray;
        front = 0;
        rear = size - 1;
    }
}
