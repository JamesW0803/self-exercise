package Lab4;

public class TestSList {
    public static void main(String[] args) {
        SList <String> sList = new SList<>();
        sList.appendEnd("LinkedList");
        sList.appendEnd("is");
        sList.appendEnd("easy");
        System.out.println("List contains: ");
        sList.display();
        System.out.println(sList.removeInitial());
        System.out.printf("'difficult' is in the list? %b\n", sList.contains("difficult"));
        sList.clear();
        sList.display();
    }
}
