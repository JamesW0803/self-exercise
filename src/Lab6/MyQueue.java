package Lab6;

import java.util.LinkedList;

public class MyQueue <E> {
    private LinkedList <E> list = new LinkedList<>();
    public MyQueue (E[] e){
        for (E item : e){
            list.add(item);
        }
    }

    public MyQueue(){}

    public void enqueue(E e){
        list.add(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public E getElement(int i){
        if (i < 0 || i >= list.size()){
            return null;
        }
        return list.get(i);
    }

    public E peek(){
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    public int getSize(){
        return list.size();
    }

    public boolean contains(E e){
        return list.contains(e);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }

    public static void main(String[] args) {
        MyQueue <String> fruitQ = new MyQueue<>(new String[] {"Durian", "Blueberry"});
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        System.out.println("FruitQ: " + fruitQ.toString());

        System.out.println("Top item: " + fruitQ.peek());
        System.out.println("Size of fruitQ: " + fruitQ.getSize());
        fruitQ.dequeue();
        System.out.println("Item in the index position of 2: " + fruitQ.getElement(2));
        System.out.println("Does the queue contains 'Cherry' ? " + fruitQ.contains("Cherry"));
        System.out.println("Does the queue contains 'Durian' ? " + fruitQ.contains("Durian"));
        while (!fruitQ.isEmpty()){
            System.out.println(fruitQ.dequeue());
        }
    }
}
