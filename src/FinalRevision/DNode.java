package FinalRevision;

public class DNode <E> {
    E element;
    DNode <E> next;
    DNode <E> prev;
    public DNode (E element, DNode <E> next, DNode <E> prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
