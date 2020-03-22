package by.javaonline.module1;

/*
    Найти сумму квадратов первых ста чисел.
*/

public class LoopTask3 {
    public static void main(String[] args) {
        double sum;

        sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + Math.pow(i, 2);
        }

        System.out.println("Сумма первых ста чисел: " + sum);
    }
}
