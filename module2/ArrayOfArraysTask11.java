package by.javaonline.module2;

import java.util.Random;

/*
    Матрицу 10х20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

 */

public class ArrayOfArraysTask11 {

    public static void main(String[] args) {

        int[][] matrix = new int[10][20];

        matrixInitialization(matrix);

        System.out.println("Полученная матрица: ");
        printMatrix(matrix);

        System.out.print("Номера строк матрицы, в которых число 5 встречается три и более раз: ");
        findLineWithMoreThenThreeFive(matrix);

    }

    public static void matrixInitialization(int[][] matrix) {

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(16);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= 10){
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print("  " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void findLineWithMoreThenThreeFive(int [][] matrix){

        int countSuccessfulSearsh = 0;

        for (int i = 0; i < matrix.length; i++) {

            int countFiveItem = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    countFiveItem++;
                }
            }

            if(countFiveItem >= 3) {
                System.out.print(i + " ");
                countSuccessfulSearsh++;
            }
        }

        if (countSuccessfulSearsh == 0) {
            System.out.print("строки не найдены");
        }
    }

}

