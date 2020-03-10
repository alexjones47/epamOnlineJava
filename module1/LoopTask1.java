package by.javaonline.module1;

import java.util.Scanner;

/*
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
*/

public class LoopTask1 {
    public static void main(String[] args) {

        int n;
        int sum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        n = scanner.nextInt();
        sum = 0;

        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }

        System.out.println("Сумма всех чисел до заданного числа: " + sum);

    }
}
