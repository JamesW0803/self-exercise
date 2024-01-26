package Lab9and10Extra;

public class Node <E extends Comparable <E>> implements Comparable <Node<E>>{
    E element;
    Node <E> next;

    public Node(E element){
        this.element = element;
        this.next = null;
    }

    @Override
    public int compareTo(Node<E> o) {
        return o.element.compareTo(element);
    }
}
