package by.javaonline.module2;

/*
    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class ArrayOfArraysTask2 {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {  {5, 2, 8, 4},
                                        {4, 3, 2, 1},
                                        {8, 7, 4, 3},
                                        {3, 4, 7, 8}};

        System.out.println("\nИсходная матрица: ");
        printMatrix(matrix);

        System.out.println("\nРезультат: ");
        analyzeMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void analyzeMatrix(int[][] matrix) {
        int j = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][j] + " ");
            j++;
        }
    }

}

