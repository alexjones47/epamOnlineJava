package by.javaonline.module2;

/*
    Задана последовательность N вещественных чисел.
    Вычеслить сумму чисел, порядковые номера которых являются простыми числами.
*/

import java.util.Scanner;
import java.util.Random;

public class SimpleArrayTask6 {

    static double sum = 0;

    public static void main(String[] args) {

        System.out.print("Введите размерность массива N: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] array = new double[n];

        initArray(array);

        analyzeArray(array);

        System.out.println("\n\nСумма элеменотов с простыми индэксами: " + sum);

    }


    public static void initArray(double[] array) {
        if (array == null) {
            return;
        }
        Random random = new Random();
        System.out.println("\nЗаданный массив:");
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100) - 50;
            System.out.print(array[i] + "   ");
        }
    }


    public static void analyzeArray(double[] array) {
        for (int i = 2; i < array.length; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                sum = sum + array[i];
            }

        }

    }


}
