package by.javaonline.module1;

/*
    Для каждого натурального числа в промежутке от m до n вывести все делители,
    кроме единицы и самого числа. m и n вводятся с клавиатуры.
*/

import java.util.Scanner;

public class LoopTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение промежутка, m = ");
        int m = scanner.nextInt();

        System.out.print("Введите конечное значение промежутка, n = ");
        int n = scanner.nextInt();

        for (int i = m; i < n; i++) {
            System.out.print("Число " + i + " делится на: ");

            for (int x = 2; x < i; x++) {
                if (i % x == 0){
                    System.out.print(x + " ");
                }
            }

            System.out.println();

        }
    }
}
