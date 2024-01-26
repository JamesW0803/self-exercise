package DoublyLinkedList;

import java.util.NoSuchElementException;

public class MyDoublyLinkedList <E> {
    private Node <E> head;
    private Node <E> tail;
    int size;

    public MyDoublyLinkedList(){
        size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addFirst(E element){
        Node <E> temp = new Node<>(element, head, null);
        if (head != null){
            head.prev = temp;
        }
        head = temp;
        if (tail == null){
            tail = temp;
        }
        size ++;
        System.out.println("Adding " + element);
    }

    public void addLast(E element){
        Node <E> temp = new Node<>(element, null, tail);
        if (tail != null){
            tail.next = temp;
        }
        tail = temp;
        if (head == null){
            head = temp;
        }
        size ++;
        System.out.println("Adding: " + element);
    }

    public void add(int index, E element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }else if (index == 0){
            addFirst(element);
        }else if (index == size){
            addLast(element);
        }else{
            Node <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            Node <E> newNode = new Node<>(element, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size ++;
        }
    }

    public E removeFirst(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node <E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp.element;
    }

    public E removeLast(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node <E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size -- ;
        return temp.element;
    }

    public E remove (int index){
        E element = null;
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            element =  removeFirst();
        }else if (index == size - 1){
            element =  removeLast();
        }else{
            Node <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            element = current.element;
            current.next.prev = current.prev;
            current.prev.next = current.next;
            current.next = null;
            current.prev = null;
            size --;
        }
        return element;
    }

    public void iterateForward(){
        Node <E> current = head;
        while (current != null){
            System.out.println(current.element);
            System.out.println(" ");
            current = current.next;
        }
    }

    public void iterateBackward(){
        Node <E> current = tail;
        while (tail != null){
            System.out.println(current.element);
            System.out.println(" ");
            current = current.prev;
        }
    }

    public void clear(){
        Node <E> current = head;
        while (head != null){
            current = head.next;
            head.prev = head.next = null;
            head = current;
        }
        tail.prev = tail.next = null;
        size = 0;
    }

    public int getSize(){
        return this.size;
    }
}
