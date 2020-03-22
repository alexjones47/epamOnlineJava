package by.javaonline.module1;
/*
    Составить программу нахождения произведения квадратов первых двухсот чисел.
*/

public class LoopTask4 {

    public static void main(String[] args) {

        double mult;

        mult = 1;

        for (int i = 1; i <= 200; i++) {
            mult = mult * Math.pow(i, 2);
        }
        
        if (Double.isInfinite(mult)) {
            System.out.println("Значение произведения выходит за пределы диапазона значений примитивного типа данных double");
        } else {
            System.out.println("Произведение квадратов первых двухсот чисел: " + mult);
        }
    }
}
