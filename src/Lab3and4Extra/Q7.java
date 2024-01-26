package Lab3and4Extra;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] matrix = new double[3][3];
        System.out.println("Enter a 3x3 Markov Matrix: ");
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix [i][j] = sc.nextDouble();
            }
        }

        if (isMarkov(matrix)){
            System.out.println("Is this a Markov Matrix? " + isMarkov(matrix));
        }else{
            System.out.println("Is this a Markov Matrix? " + isMarkov(matrix));
        }
    }

    public static boolean isMarkov(double[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++){
            double sum = 0;
            for (double[] doubles : matrix) {
                if (doubles[j] < 0) {
                    return false;
                }
                sum += doubles[j];
            }
            if (sum != 1){
                return false;
            }
        }
        return true;
    }
}
