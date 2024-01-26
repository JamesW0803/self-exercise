package Lab4;

public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(100);
        list.add(2, 2);
        //fix for element at index 3
        list.addLast(1000);
        list.remove(3);
        list.iterateForward();
        list.iterateBackward();
        System.out.printf("Size of current list: %d\n", list.getSize());
        list.clear();
        System.out.printf("Size of current list: %d\n", list.getSize());

    }
}
