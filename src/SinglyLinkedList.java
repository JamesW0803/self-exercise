import java.util.List;
import java.util.Scanner;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size(){
        if (head == null){
            return 0;
        }
        int size = 0;
        ListNode current = head;
        while (current != null){
            size ++;
            current = current.next;
        }
        return size;
    }

    public void addFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean search(int searchKey){
        if (head == null){
            return false;
        }
        ListNode current = head;
        while (current!= null){
            if (current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse(){
        if (head == null){
            return;
        }

        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public ListNode getMiddleNode(){
        if (head == null){
            return null;
        }
        ListNode slowPoint = head;
        ListNode fastPoint = head;
        while (fastPoint != null && fastPoint.next != null){
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next.next;
        }
        return slowPoint;
    }

    public ListNode getNthNodeFromEnd(int n){
        if (head == null){
            return null;
        }
        if (n <= 0){
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }
        ListNode mainPoint = head;
        ListNode refPoint = head;
        int count = 0;
        while (count < n){
            refPoint = refPoint.next;
            count++;
        }
        while (refPoint != null){
            refPoint = refPoint.next;
            mainPoint = mainPoint.next;
        }
        return mainPoint;
    }

    public ListNode insertInSortedList(int n){
        ListNode newNode = new ListNode(n);

        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        assert temp != null;
        temp.next = newNode;
        return head;
    }

    public void sort() {
        ListNode sorted = null;

        // Traverse the original list and insert each node into sorted
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;

            // Insert current in sorted linked list
            if (sorted == null || sorted.data >= current.data) {
                current.next = sorted;
                sorted = current;
            } else {
                ListNode temp = sorted;
                while (temp.next != null && temp.next.data < current.data) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }

            current = next;
        }

        // Update head to point to sorted linked list
        head = sorted;
    }

    public void removeDuplicates(){
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }

    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;
        if (current != null && current.data == key){
            head = current.next;
            return;
        }
        while (current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if (current == null){
            return;
        }
        temp.next = current.next;
    }

    public boolean containsLoop(){
        ListNode fastPoint = head;
        ListNode slowPoint = head;
        while (fastPoint != null && fastPoint.next != null){
            fastPoint = fastPoint.next.next;
            slowPoint = slowPoint.next;
        }
        return slowPoint == fastPoint;
    }

    public void createLoop(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(2);
//        ListNode fourth = new ListNode(3);
//
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;
//
//        //display
//        sll.display();
//
//        //size
//        System.out.println("Size of the linkedlist is: " + sll.size());
//
//        //addFirst
//        sll.addFirst(54);
//        sll.display();
//
//        //addLast
//        sll.addLast(50);
//        sll.display();
//
//        //search
//        System.out.println("Does value 1 occur in the linkedlist? " + sll.search(1));
//
//        //reverse
//        sll.reverse();
//        sll.display();
//
//        //find the middle node
//        System.out.println("The middle node in the linked list is: " + sll.getMiddleNode().data);
//
//        //find the nth node from the end
//        System.out.println("Enter the n th node you want to get: ");
//        int n = sc.nextInt();
//        ListNode getNthNodeFromEnd = sll.getNthNodeFromEnd(n);
//        System.out.println("The " + n + " th node from the end in the linked list is: " + getNthNodeFromEnd.data);
//
//        sll.sort();
//        sll.display();
//
//        sll.insertInSortedList(48);
//        sll.display();
//
//        sll.deleteNode(1);
//        sll.display();
        sll.createLoop();
        System.out.println("Does the linked list contains loop(s) ?: " + sll.containsLoop());
    }

}
