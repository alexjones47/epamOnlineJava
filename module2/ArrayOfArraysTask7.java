package by.javaonline.module2;

import java.util.Scanner;

/*
    Сформировать квадратную матрицу порядка N по правилу:
    A[I,J] = sin ((I^2 - J^2) / N)

 */

public class ArrayOfArraysTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок квадратной матрицы, n: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        int countPositiveItem = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] > 0) {
                    countPositiveItem++;
                }
            }
        }

        System.out.println("Сформированная матрица: ");
        printMatrix(matrix);

        System.out.println("\nКоличество положительных элементов: " + countPositiveItem);
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

