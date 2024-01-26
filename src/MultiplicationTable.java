//Write a java program to display the multiplication table of a given integer using for loop

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of the multiplication table: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns of the multiplication table: ");
        int col = sc.nextInt();

        int [][] multiplicationTable = generateMultiplicationTable(row, col);

        printMultiplicationTable(multiplicationTable);

        sc.close();
    }

    public static int[][] generateMultiplicationTable(int row, int col){
        int [][] table = new int [row] [col];

        for (int i = 1; i <= row; i++){
            for (int j = 1; j<= col; j++){
                table [i-1][j-1] = i*j;
            }
        }
        return table;
    }

    public static void printMultiplicationTable(int [][] table){
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                System.out.printf("%-5d", table[i][j]);
            }
            System.out.println();
        }
    }
}
