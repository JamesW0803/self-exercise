package Lab4;

import java.util.NoSuchElementException;

public class DoublyLinkedList <E> {
    Node <E> head;
    Node <E> tail;
    int size;

    public DoublyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    public void addFirst(E element){
        Node <E> newNode = new Node<>(element, head, null);
        if (head != null){
            head.prev = newNode;
            head = newNode;
        }
        if (tail == null){
            tail = newNode;
        }
        size++;
        System.out.println("Adding: " + element);
    }

    public void addLast(E element){
        Node <E> newNode = new Node<>(element, null, tail);
        if (tail != null){
            tail.next = newNode;
            tail = newNode;
        }
        if (head == null){
            head = newNode;
        }
        size ++;
        System.out.println("Adding: " + element);
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
            Node <E> current = head;
            for (int i = 0; i < index; i ++){
                current = current.next;
            }
            Node <E> newNode = new Node<>(element, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size ++;
            System.out.println("Adding: " + element);
        }
    }

    public E removeFirst(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node <E> current = head;
        head = head.next;
        head.prev = null;
        size --;
        System.out.println("Deleted: " + current.element);
        return current.element;
    }

    public E removeLast(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node <E> current = tail;
        tail = tail.prev;
        tail.next = null;
        System.out.println("Deleted: " + current.element);
        return current.element;
    }

    public E remove(int index){
        E element = null;
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            element = removeFirst();
        }else if (index == size - 1){
            element = removeLast();
        }else{
            Node <E> current = head;
            for (int i = 0; i < index; i ++){
                current = current.next;
            }
            element = current.element;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
            size --;
        }
        return element;
    }

    public void clear(){
        System.out.println("successfully clear " + getSize() + " node(s)");
        Node<E> current = head;
        while(head != null){
            current = head.next;
            head.prev = head.next = null;
            head = current;
        }
        current = null;
        tail.prev = tail.next = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void iterateForward(){
        System.out.println("Iterating forward: ");
        Node <E> current = head;
        while (current != null){
            System.out.println(current.element + " ");
            current = current.next;
        }
    }

    public void iterateBackward(){
        System.out.println("Iterating backward: ");
        Node <E> current = tail;
        while (current != null){
            System.out.println(current.element + " ");
            current = current.prev;
        }
    }
}
