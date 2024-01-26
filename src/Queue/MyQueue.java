package Queue;

import java.util.LinkedList;

public class MyQueue <E> {
    private LinkedList<E> queue;

    public MyQueue(E[] e){
        queue = new LinkedList<>();
        for (E element : e){
            enqueue(element);
        }
    }

    public MyQueue(){

    }

    public void enqueue(E e){
        queue.addLast(e);
    }

    public E dequeue(E e){
        if (queue.isEmpty()){
            return null;
        }
        return queue.removeFirst();
    }

    public E getElement(int i){
        if (i < 0 || i>= getSize()){
            return null;
        }
        return queue.get(i);
    }

    public int getSize(){
        return queue.size();
    }

    public E peek(){
        if (queue.isEmpty()){
            return null;
        }
        return queue.getFirst();
    }

    public boolean contains (E e){
        return queue.contains(e);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public String toString(){
        return queue.toString();
    }
}
