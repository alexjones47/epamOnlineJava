package by.javaonline.module2;

import java.util.Scanner;

/*
    Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
     1    1    1    ...   1    1    1
     2    2    2    ...   2    2    0
     3    3    3    ...   3    0    0
     :    :    :    :.    :    :    :
    n-1  n-1   0    ...   0    0    0
     n    0    0    ...   0    0    0
 */

public class ArrayOfArraysTask5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок квадратной матрицы, n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        int numberOfLine = 1;
        int countBorder = n;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < countBorder; j++) {
                matrix[i][j] = numberOfLine;
            }

            numberOfLine++;
            countBorder--;
        }
        
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

