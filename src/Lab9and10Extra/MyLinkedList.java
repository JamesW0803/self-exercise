package Lab9and10Extra;

public class MyLinkedList <E extends Comparable <E>> {
    Node <E> head;
    Node <E> tail;
    int size;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public MyLinkedList(Node <E> head, Node <E> tail, int size){
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(E element){
        Node <E> newElement = new Node<>(element);
        if (head == null){
            head = tail = newElement;
        }else{
            Node <E> current = head;
            head = newElement;
            head.next = current;
        }
        size ++;
    }

    public void addLast(E element){
        Node <E> newElement = new Node<>(element);
        if (tail == null){
            tail = head = newElement;
        }else{
            tail.next = newElement;
            tail = newElement;
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
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            Node <E> temp = current.next;
            current.next = new Node<>(element);
            (current.next).next = temp;
            size ++;
        }
    }

    public E removeFirst(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty.");
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
            throw new IllegalStateException("List is empty.");
        }else if (size == 1){
            Node <E> current = head;
            head = tail = null;
            size = 0;
            return current.element;
        }else{
            Node <E> current = head;
            while (current.next != tail){
                current = current.next;
            }
            Node <E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
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

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        sb.append("size=").append(getSize()).append("]");
        Node <E> current = head;
        while (current != null){
            sb.append(" >> ");
            sb.append(current.element.toString());
            current = current.next;
        }
        return sb.toString();
    }

    public boolean contains(E element){
        Node <E> current = head;
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
        System.out.println("The list is cleared,");
    }

    public MyLinkedList <E> combine(MyLinkedList <E> list1, MyLinkedList <E> list2){
        Node <E> current1 = list1.head;
        Node <E> current2 = list2.head;
        MyLinkedList <E> list3 = new MyLinkedList<>();
        E lastAdded = null;

        while (current1 != null && current2 != null){
            if (current1.element.compareTo(current2.element) < 0){
                if (lastAdded == null || !lastAdded.equals(current1.element)){
                    list3.addLast(current1.element);
                    lastAdded = current1.element;
                }
                current1 = current1.next;
            }else{
                if (lastAdded == null || !lastAdded.equals(current2.element)){
                    list3.addLast(current2.element);
                    lastAdded = current2.element;
                }
                current2 = current2.next;
            }
        }

        while (current1 != null){
            if (lastAdded == null || !lastAdded.equals(current1.element)){
                list3.addLast(current1.element);
                lastAdded = current1.element;
            }
            current1 = current1.next;
        }

        while (current2 != null){
            if (lastAdded == null || !lastAdded.equals(current2.element)){
                list3.addLast(current2.element);
                lastAdded = current2.element;
            }
            current2 = current2.next;
        }
        return list3;
    }

    public MyLinkedList<E> reverse(MyLinkedList<E> list){
        MyLinkedList <E> reversedList = new MyLinkedList<>();
        Node <E> current = list.head;
        while (current != null){
            reversedList.addFirst(current.element);
            current = current.next;
        }
        return reversedList;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
