public class sumOf2dArray {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix2 = {
                {2,4,6},
                {2,4,6},
                {2,4,6}
        };

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] sumMatrix = new int [rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Matrix 1: ");
        displayMatrix(matrix1);

        System.out.println("Matrix 2: ");
        displayMatrix(matrix2);

        System.out.println("Sum of the matrix: ");
        displayMatrix(sumMatrix);
    }

    public static void displayMatrix(int[][] array){
        for (int[] row : array){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
