package FinalRevision;


public class QueueArray <E> {
    int front = 0;
    int rear = -1;
    int size = 0;
    E[] elements;

    @SuppressWarnings("unchecked")
    public QueueArray (int capacity){
        elements = (E[]) new Object[capacity];
    }

    public QueueArray(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public void enqueue(E element){
        if (size == elements.length){
            expandQueue();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size ++;
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

    public E peek(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void expandQueue() {
        int newCapacity = elements.length * 2;
        E[] newArray = (E[]) new Object[newCapacity];
        for (int i = 0 ; i < size; i++){
            newArray[i] = elements[(front + i) % elements.length];
        }
        elements = newArray;
        front = 0;
        rear = size - 1;
    }
}
