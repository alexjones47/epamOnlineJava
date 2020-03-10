package by.javaonline.module1;

import java.util.Scanner;

/*
    Вычислить значение функции:
    F(x) =    x^2 + 3x + 9, если x<=3;
              1 / (x^3 + 6), если x>3;
 */

public class ConditionTask5 {

    public static void main(String[] args) {

        double x;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        x = scanner.nextDouble();

        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("Result: " + result);

    }
}
