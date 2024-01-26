package Lab9and10Extra;

import javax.swing.*;
import java.net.Inet4Address;

public class DoublyLinkedList <E extends Comparable <E>> {
    DLNode <E> head;
    DLNode <E> tail;
    int size = 0;

    public DoublyLinkedList(){}

    public DoublyLinkedList(DLNode <E> head, DLNode <E> tail, int size){
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(E element){
        DLNode <E> newNode = new DLNode<>(element, head, null);
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null){
            tail = newNode;
        }
        size ++;
    }

    public void addLast(E element){
        DLNode <E> newNode = new DLNode<>(element, null, tail);
        if (tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null){
            head = newNode;
        }
        size ++;
    }

    public void add(int index, E element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            addFirst(element);
        }else if (index == size){
            addLast(element);
        }else{
            DLNode <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            DLNode <E> newNode = new DLNode<>(element, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size ++;
        }
    }

    public E removeFirst(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty.");
        }else{
            DLNode <E> current = head;
            head = head.next;
            head.prev = null;
            size --;
            return current.element;
        }
    }

    public E removeLast(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
        }else{
            DLNode <E> current = tail;
            tail = tail.prev;
            tail.next = null;
            size --;
            return current.element;
        }
    }

    public E remove(int index){
        E element = null;
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            return removeFirst();
        }else if (index == size - 1){
            return removeLast();
        }else{
            DLNode <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            DLNode <E> temp = current;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
            size--;
            return temp.element;
        }
    }

    public String toString(){
        DLNode <E> current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[size=").append(getSize()).append("]");
        for (int i = 0; i < size; i++){
            sb.append(" >> ");
            sb.append(current.element.toString());
            current = current.next;
        }
        sb.append("\n");
        current = tail;
        while (current != null){
            sb.append(" << ");
            sb.append(current.element.toString());
            current = current.prev;
        }
        return sb.toString();
    }

    public boolean contains(E element){
        DLNode <E> current = head;
        while (current != null){
            if (current.element.equals(element)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear(){
        head = tail = null;
        System.out.println("The list is cleared");
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList <Integer> list = new DoublyLinkedList<>();
        list.addLast(10);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
        System.out.println(list.toString());
        list.add(4,20);
        System.out.println(list.toString());
        System.out.println(list.contains(20));

        list.removeLast();
        System.out.println(list.toString());

        list.remove(4);
        System.out.println(list.toString());
    }
}
