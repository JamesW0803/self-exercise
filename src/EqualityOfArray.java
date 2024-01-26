public class EqualityOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,6};

        boolean areEqual = areArraysEqual(arr1, arr2);

        if (areEqual){
            System.out.println("The arrays are equal. ");
        }else{
            System.out.println("The arrays are not equal. ");
        }
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }


}
