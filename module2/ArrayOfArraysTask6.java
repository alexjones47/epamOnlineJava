package by.javaonline.module2;

import java.util.Scanner;

/*
    Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
     1    1    1    ...   1    1    1
     0    1    1    ...   1    1    0
     0    0    1    ...   1    0    0
     :    :    :    :.    :    :    :
     0    1    1    ...   1    1    0
     1    1    1    ...   1    1    1
 */

public class ArrayOfArraysTask6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок квадратной матрицы, n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        int numberOfLine = 1;
        int countBorderMin = 0;
        int countBorderMax = n;
        int countOfIteration = 0;

        for (int i = 0; i < matrix.length; i++) {

            countOfIteration++;

            if (i == n/2){
                countBorderMax++;
                countBorderMin--;
            }

            for (int j = countBorderMin; j < countBorderMax; j++) {
                matrix[i][j] = numberOfLine;
            }

            if (countOfIteration <= n/2) {
                countBorderMax--;
                countBorderMin++;
            } else {
                countBorderMax++;
                countBorderMin--;
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

