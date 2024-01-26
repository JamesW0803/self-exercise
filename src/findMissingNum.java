//write a program to find missing number in an array

public class findMissingNum {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,5,6,7,8,9,10};
        int size = numbers.length + 1;

        int missingNum = findMissNum(numbers, size);
        System.out.println("The missing number is: " + missingNum);
    }

    public static int findMissNum(int[] array, int n){
        int totalSum = n*(n+1) / 2;
        int arraySum = 0;

        for (int num : array){
            arraySum += num;
        }

        return totalSum - arraySum;
    }
}
