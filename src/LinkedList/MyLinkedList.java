package LinkedList;

public class MyLinkedList<E> {
    Node <E> head;
    Node <E> tail;
    int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E element){
        Node <E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size ++;
        if (tail == null){
            tail = head;
        }
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, E element){
        if (index == 0){
            addFirst(element);
        }else if (index >= size){
            addLast(element);
        }else{
            Node <E> current = head;
            for (int i = 0; i < index - 1; i++){
                current = current.next;
            }
            Node <E> temp = current.next;
            current.next = new Node <>(element);
            current.next.next = temp;
            size ++;
        }
    }

    public E removeFirst(){
        if (size == 0){
            System.out.println("The list is empty.");
            return null;
        }else{
            Node <E> temp = head;
            head = head.next;
            size--;
            if (head == null){
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast(){
        if (size == 0){
            System.out.println("The list is empty.");
            return null;
        }else if(size == 1){
            Node <E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else{
            Node <E> current = head;
            while (current.next != tail){
                current = current.next;
            }
            Node <E> temp = tail;
            tail = current;
            tail.next = null;
            size --;
            return temp.element;
        }
    }

    public E remove(int index){
        if (index < 0 || index >= size){
            return null;
        }else if (index == 0){
            return removeFirst();
        }else if (index == size - 1){
            return removeLast();
        }else{
            Node <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            Node <E> temp = current.next;
            current.next = current.next.next;
            size --;
            return temp.element;
        }
    }

    public int size(){
        return size;
    }

    public boolean contains(E e){
        Node <E> current = head;
        while (current != null){
            if (current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display(){
        if (head == null && tail == null){
            System.out.println("List is empty");
        }else{
            System.out.println("The list is shown below...");
            Node <E> current = head;
            while (current != null){
                System.out.println(current.element + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
