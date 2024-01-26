import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularSinglyLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode (5);
        ListNode third = new ListNode (10);
        ListNode fourth = new ListNode (20);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display(){
        if (last == null){
            return;
        }
        ListNode first = last.next;
        while (first != last){
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data + " ");
        System.out.println();
    }

    public void addFirst(int data){
        ListNode temp = new ListNode(data);
        if (last == null){
            last = temp;
        }else{
            temp.next = last.next;
        }
        last.next = temp;
        length ++;
    }

    public void addLast(int data){
        ListNode temp = new ListNode(data);
        if (last == null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length ++;
    }

    public void removeFirst(int data){
        if (isEmpty()){
            throw new NoSuchElementException("The linked list is already empty!");
        }
        ListNode temp = last.next;
        if (last.next == last){
            last = null;
        }else{
            last.next = temp.next;
        }
        temp.next = null;
        length --;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularSinglyLinkedList();
        csll.display();
        csll.addFirst(15);
        csll.display();

    }
}
