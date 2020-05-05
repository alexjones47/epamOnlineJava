package by.javaonline.module2;

import java.util.Scanner;

/*
    Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
    1   2    3    ...   n
    n  n-1  n-2   ...   1
    1   2    3    ...   n
    n  n-1  n-2   ...   1
    :   :    :    :.    :
    n  n-1  n-2   ...   1
 */

public class ArrayOfArraysTask4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок квадратной матрицы, n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            int evenLine = 1;
            int oddLine = n;
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = evenLine;
                    evenLine++;
                } else {
                    matrix[i][j] = oddLine;
                    oddLine--;
                }
            }
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

