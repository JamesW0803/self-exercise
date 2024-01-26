package Lab2;

public class ArrayBagDemo {
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        testAdd(bag1, contentsOfBag1);
        testAdd(bag2, contentsOfBag2);
        displayBag(bag1);
        displayBag(bag2);

        ArrayBag<String> bag3 = (ArrayBag<String>) bag1.union(bag2);
        displayBag(bag3);
        ArrayBag<String> bag4 = (ArrayBag<String>) bag1.intersection(bag2);
        displayBag(bag4);
        ArrayBag<String> bag5 = (ArrayBag<String>) bag1.difference(bag2);
        displayBag(bag5);
    }

    private static void testAdd(BagInterface<String> aBag, String[] content){
        for(String str: content){
            aBag.add(str);
        }
    }

    private static void displayBag(BagInterface<String> aBag){
        System.out.printf("The bag contains %d string(s), as follows:\n", aBag.getCurrentSize());
        StringBuilder str = new StringBuilder();
        Object[] temp = aBag.toArray();
        for(int i=0; i < aBag.getCurrentSize(); i++){
            str.append(temp[i]);
            if(i != aBag.getCurrentSize() - 1)
                str.append(", ");
        }
        System.out.println(str);
    }
}