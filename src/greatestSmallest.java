//write a program to find the greatest and smallest element in an array

public class greatestSmallest {
    public static void main(String[] args) {
        int[] array = {1,10,22,2,30,50};

        int max = findMax(array);
        int min = findMin(array);

        System.out.println("The greatest number in the array: " + max);
        System.out.println("The smallest number in the array: " + min);
    }

    public static int findMax(int[] array){
        int max = array[0];

        for (int i = 0 ; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array){
        int min = array[0];

        for (int i = 0 ; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
