package FinalRevision;

import java.util.regex.Pattern;

public class DoublyLinkedList <E> {
    DNode <E> head;
    DNode <E> tail;
    int size;

    public DoublyLinkedList(){

    }

    public DoublyLinkedList(DNode <E> head, DNode <E> tail, int size){
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(E element){
        DNode <E> newNode = new DNode<>(element, head, null);
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
        DNode <E> newNode = new DNode<>(element, null, tail);
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
            DNode <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            DNode <E> newNode = new DNode<>(element, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size ++;
        }
    }

    public E removeFirst(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        DNode <E> current = head;
        head = head.next;
        head.prev = null;
        size --;
        return current.element;
    }

    public E removeLast(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        DNode <E> current = tail;
        tail = tail.prev;
        tail.next = null;
        size --;
        return current.element;
    }

    public E remove(int index){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }else if (index == 0){
            return removeFirst();
        }else if (index == size - 1){
            return removeLast();
        }else{
            DNode <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            DNode <E> temp = current;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
            size --;
            return temp.element;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
