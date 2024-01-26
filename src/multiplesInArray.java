public class multiplesInArray {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,11,13,15};
        int numberToCountMultiples = 3;

        int multiples = countMultiples(numbers, numberToCountMultiples);
        System.out.println("The number of multiples of " + numberToCountMultiples + " in the array: " + multiples);
    }

    public static int countMultiples(int[] arr, int number){
        int count = 0;

        for (int num : arr){
            if (num % number == 0){
                count ++;
            }
        }
        return count;
    }
}
