package by.javaonline.module2;

/*
    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и
    нулевых элементов.
*/

import java.util.Scanner;
import java.util.Random;

public class SimpleArrayTask3 {

    public static void main(String[] args) {
        
        System.out.print("Введите размерность массива N: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        double[] array = new double[n];
        
        initArray(array);

        analyzeArray(array);
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

        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                countPositive++;
            } else if (array[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.println("\n\nКоличество положительных элементов массива: " + countPositive);
        System.out.println("Количество отрицательных элементов массива: " + countNegative);
        System.out.println("Количество элементов массива равных нулю: " + countZero);
    }

}
