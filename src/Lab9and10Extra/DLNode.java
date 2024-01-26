package Lab9and10Extra;

public class DLNode <E extends Comparable <E>> implements Comparable <DLNode <E>>{
    E element;
    DLNode <E> next;
    DLNode <E> prev;

    public DLNode(E element, DLNode <E> next, DLNode <E> prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public int compareTo(DLNode<E> o) {
        return o.element.compareTo(element);
    }
}
