package by.javaonline.module1;

/*
    Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
    модуль которых больше или равен заданному e. Общий член ряда имеет вид:

    An = 1/(2^n)  + 1/(3^n)

*/

import java.util.Scanner;

public class LoopTask5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введиете проверочное число e: ");
        double e = scanner.nextDouble();

        System.out.print("Введиете максимальное значение числа n: ");
        int n = scanner.nextInt();

        double sum;

        sum = 0;

        for ( int i = 0; i < n; i++ ) {
            double value = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(value) >= e) {
                sum = sum + value;
            }
        }

        System.out.println("Сумма равна: " + sum);

    }
}
