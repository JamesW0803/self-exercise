package Lab1;

public class MinMax <E> {
    public static <E extends Comparable <E>> String minmax(E[] array){
        if (array == null || array.length == 0){
            return "Array is empty or null";
        }

        E min = array[0];
        E max = array[0];

        for (E element : array){
            if (element.compareTo(min) < 0){
                min = element;
            }
            if (element.compareTo(max) > 0){
                max = element;
            }
        }
        return "Min = " + min + " Max = " + max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
