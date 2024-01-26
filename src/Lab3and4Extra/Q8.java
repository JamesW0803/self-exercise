package Lab3and4Extra;

import java.util.Random;

public class Q8 {
    public static void main(String[] args) {
        int [][] m = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
        shuffle(m);

        for (int i = 0; i < m.length; i++){
            System.out.print("(" + m[i][0] + "," + m[i][1] + ")");
            if (i < m.length - 1){
                System.out.print(", ");
            }
        }
    }

    public static void shuffle(int[][] m) {
        Random rand = new Random();
        for (int i = 0 ; i < m.length; i++){
            int randomIndex = rand.nextInt(m.length);
            int[] temp = m[i];
            m[i] = m[randomIndex];
            m[randomIndex] = temp;
        }
    }
}
