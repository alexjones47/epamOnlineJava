package by.javaonline.module1;
/*
    Составить программу нахождения произведения квадратов первых двухсот чисел.
*/

import java.math.BigInteger;

public class LoopTask4 {

    public static void main(String[] args) {

        BigInteger mult;

        mult = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            mult = mult.multiply(BigInteger.valueOf(i*i));
        }

        System.out.println("Произведение квадратов первых двухсот чисел: " + mult);

    }
}
