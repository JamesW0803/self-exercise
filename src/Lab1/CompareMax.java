package Lab1;

public class CompareMax <E extends Comparable <E>>{
    public static <E extends Comparable <E>> E maximum(E a, E b, E c){
        if (a.compareTo(b) < 0){
            a = b;
        }
        if (a.compareTo(c) < 0){
            a = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;

        System.out.println("Maximum value: " + maximum(a,b,c));
    }
}
