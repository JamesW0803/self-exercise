package Lab3and4Extra;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] intArray = new int [4][4];

        System.out.println("Enter a 4x4 integer array: ");
        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; j++){
                intArray[i][j] = sc.nextInt();
            }
        }

        int[] location = locateSmallest(intArray);
        System.out.println("Location: (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] locateSmallest(int[][] intArray) {
        int[] location = new int[2];
        int smallest = intArray[0][0];

        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; j++){
                if (intArray[i][j] < smallest){
                    smallest = intArray[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
