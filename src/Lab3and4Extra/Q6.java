package Lab3and4Extra;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] matrix1 = new double[2][2];
        double [][] matrix2 = new double[2][2];

        System.out.print("Enter 4 values for a 2x2 matrix A: ");
        for (int i = 0 ; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = sc.nextDouble();
            }
        }

        System.out.print("Enter 4 values for a 2x2 matrix B: ");
        for (int i = 0 ; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = sc.nextDouble();
            }
        }

        double [][] sumMatrix = addMatrix(matrix1, matrix2);
        System.out.println("The addition of the two matrix results in ");
        for (double[] x : sumMatrix){
            for (double num : x){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double [][] sum = new double[matrix1.length][matrix1[0].length];
        for (int i = 0 ; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
}
