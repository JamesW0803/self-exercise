package Lab1;

public class MinMaxTwoDArray {
    public static <E extends Comparable <E>> E min (E [][] list){
        if (list == null || list.length == 0){
            return null;
        }

        E min = list[0][0];
        for (E []sublist : list){
            for (E element : sublist){
                if (element.compareTo(min) < 0){
                    min = element;
                }
            }
        }
        return min;
    }

    public static <E extends Comparable <E>> E max (E [][] list){
        if (list == null || list.length == 0){
            return null;
        }

        E max = list[0][0];
        for (E[] sublist : list){
            for (E element : sublist){
                if (element.compareTo(max) > 0){
                    max = element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        Integer minNumber = min(numbers);
        System.out.println("Minimum number: " + minNumber);
        Integer maxNumber = max(numbers);
        System.out.println("Maximum number: " + maxNumber);
    }
}
