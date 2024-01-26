package Lab7and8Extra;


public class MyQueue <E> {
    private E[] elements;
    private int front = 0;
    private int rear = -1;
    private int size;

    @SuppressWarnings("unchecked")
    public MyQueue(int capacity){
        elements = (E[]) new Object[capacity];
    }
    public MyQueue(){
        this (10);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E peek(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        return elements[front];
    }

    public void enqueue(E element){
        if (size == elements.length){
            expandQueue();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size ++;
    }

    @SuppressWarnings("unchecked")
    private void expandQueue() {
        int newCapacity = elements.length * 2;
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newElements[i] = elements[(front + i) % elements.length];
        }
        elements = newElements;
        front = 0;
        rear = size - 1;
    }

    public E dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        E element = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size --;
        return element;
    }

    public void display(){
        if (!isEmpty()){
            for (int i = 0; i < elements.length; i+= 2){
                if (elements[i] != null){
                    System.out.print(elements[i] + " " + elements[i+1] + " --> ");
                }
            }
        }else{
            System.out.println("Queue is empty.");
        }
    }

    public void displayProduct(){
        if (!isEmpty()){
            for (int i = 0; i < size; i++){
                int index = (front + i) % elements.length;
                System.out.print(elements[index] + " --> ");
            }
        }else{
            System.out.println("Queue is empty.");
        }
    }

    public int getSize(){
        return size;
    }
}
