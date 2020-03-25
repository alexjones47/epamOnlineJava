package by.javaonline.module1;

/*
    Даны два числа. Определить цифры, входящие в заспись как первого так и второго числа
*/

import java.util.Scanner;

public class LoopTask8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        int tempFirst;
        int tempSecond;

        System.out.println("Цифры входящие в первое число: ");

        while (firstNumber >= 1 ) {
            tempFirst = firstNumber % 10;
            firstNumber = firstNumber / 10;
            System.out.print(tempFirst + " ");
        }

        System.out.println("\nЦифры входящие во второе число: ");

        while (secondNumber >= 1 ) {
            tempSecond = secondNumber % 10;
            secondNumber = secondNumber / 10;
            System.out.print(tempSecond + " ");
        }

    }

}

