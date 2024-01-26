package LinkedList;

import Lab9and10Extra.MyLinkedList;

public class Tester {
    public static void main(String[] args) {
        MyLinkedList <Integer> list1 = new MyLinkedList<>();
        list1.addLast(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);
        System.out.println(list1.toString());
//        MyLinkedList<Integer> reversedList = list1.reverse(list1);
//        System.out.println(reversedList.toString());
        MyLinkedList <Integer> list2 = new MyLinkedList<>();
        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        System.out.println(list2.toString());

        MyLinkedList <Integer> list3 = list1.combine(list1, list2);
        System.out.println(list3.toString());


    }
}
