package by.javaonline.module2;

import java.util.Scanner;

/*
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    Определить какой столбец содержит максимальную сумму.

 */

public class ArrayOfArraysTask9 {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {  {5, 2, 8, 4},
                                        {4, 3, 2, 1},
                                        {8, 7, 4, 3},
                                        {3, 4, 7, 8}};

        System.out.println("\nИсходная матрица: ");
        printMatrix(matrix);

        System.out.println("\nМассив сумм столбцов: ");
        printArray(findRowSum(matrix));

        System.out.print("\nМаксимальная сумма: ");
        System.out.println(findMaxRowSum(findRowSum(matrix)));
    }

    public static void printArray(int[] matrix) {
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i] + " ");

        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] findRowSum(int[][] matrix) {

        int n = matrix[0].length;
        int [] rowSum = new int[n];

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[j][i];
            }
            rowSum[i] = sum;
        }

        return rowSum;
    }

    public static int findMaxRowSum (int[] array) {

        int maxRowSum = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxRowSum) {
                maxRowSum = array[i];
            }
        }

        return maxRowSum;
    }

}

