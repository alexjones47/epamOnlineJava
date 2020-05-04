package by.javaonline.module2;

/*
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class ArrayOfArraysTask1 {

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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 0 && matrix[0][j] > matrix[(matrix[i].length -1)][j]) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

