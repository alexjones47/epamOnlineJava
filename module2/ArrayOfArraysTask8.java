package by.javaonline.module2;

import java.util.Scanner;

/*
    В числовой матрице поменять местами два любых столбца,
    т.е. все элементы одного столбца поставить на соответствующие им позиции другого,
    а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

 */

public class ArrayOfArraysTask8 {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {  {5, 2, 8, 4},
                                        {4, 3, 2, 1},
                                        {8, 7, 4, 3},
                                        {3, 4, 7, 8}};

        System.out.println("\nИсходная матрица: ");
        printMatrix(matrix);

        analyzeMatrix(matrix);

        System.out.println("\nПолученная матрица: ");
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

    public static void analyzeMatrix(int[][] matrix) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите номер первого столбца, row1: ");
        int row1 = scanner.nextInt();

        System.out.print("Введите номер второго столбца, row2: ");
        int row2 = scanner.nextInt();

        System.out.println();

        int tempHelper;

        for (int i = 0; i < matrix.length; i++) {
                tempHelper = matrix[i][row1];
                matrix[i][row1] = matrix[i][row2];
                matrix[i][row2] = tempHelper;
        }
    }

}

