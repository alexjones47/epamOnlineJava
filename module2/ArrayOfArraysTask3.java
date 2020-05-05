package by.javaonline.module2;

import java.util.Scanner;

/*
    Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class ArrayOfArraysTask3 {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {  {5, 2, 8, 4},
                                        {4, 3, 2, 1},
                                        {8, 7, 4, 3},
                                        {3, 4, 7, 8}};

        System.out.println("\nИсходная матрица: ");
        printMatrix(matrix);

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

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите искомую строку, k: ");
        int k = scanner.nextInt();

        System.out.print("Введите искомый столбец, p: ");
        int p = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (i == k) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                if (j == p) {
                    System.out.println(matrix[i][j]);
                }
            }
        }

    }

}

