package FinalRevision;

public class SinglyLinkedList <E> {
    Node <E> head;
    Node <E> tail;
    int size;

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public SinglyLinkedList(Node <E> head, Node <E> tail, int size){
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public int getSize (){
        return size;
    }

    public void addFirst(E element){
        Node <E> newNode = new Node<>(element);
        if (head == null){
            head = tail = newNode;
        }
        Node <E> current = head;
        head = newNode;
        head.next = current;
        size ++;
    }

    public void addLast(E element){
        Node <E> newNode = new Node<>(element);
        if (tail == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size ++;
    }

    public void add(int index, E element){
        if (index < 0){
            throw new IndexOutOfBoundsException();
        }else if (index == 0){
            addFirst(element);
        }else if (index >= size){
            addLast(element);
        }else{
            Node <E> current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            Node <E> temp = current.next;
            current.next = new Node<>(element);
            current.next.next = temp;
            size ++;
        }
    }

    public E removeFirst(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        Node <E> current = head;
        head = head.next;
        size --;
        if (head == null){
            tail = null;
        }
        return current.element;
    }

    public E removeLast(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
        }else if (size == 1){
            Node <E> current = head;
            head = tail = null;
            size = 0;
            return current.element;
        }
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

    public E remove(int index){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
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

    private boolean isEmpty() {
        return size == 0;
    }
}
