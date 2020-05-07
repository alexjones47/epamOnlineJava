package by.javaonline.module2;

/*
    Найти сумму положительных элементов главной диагонали квадратной матрицы.

 */

public class ArrayOfArraysTask10 {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {  {5,  2,  8,  4},
                                        {4, -3,  2,  1},
                                        {8,  7,  4,  3},
                                        {3,  4,  7, -8}};

        System.out.println("\nИсходная матрица: ");
        printMatrix(matrix);

        System.out.println("\nСумма положительных элементов главной диагонали: ");
        System.out.println(findPositiveDiagonalSum(matrix));;

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] >= 0) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    public static int findPositiveDiagonalSum(int[][] matrix) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        return sum;
    }

}

