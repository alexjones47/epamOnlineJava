package by.javaonline.module1;

import java.util.Scanner;

/*
   Дано натуральное число Т, которое представляет длительность
   прошедшего времени в секундах. Вывести данное значение
   длительности в часах, минутах и секундах в следующей форме:
   HHч MMмин SSс.
*/

public class LinearTask5 {

    public static void main(String[] args) {

        int t; // Исходное значение числа T
        int ss; // секунды SS
        int mm; // минуты MM
        int hh; // часы HH

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение длительности прошедшего времени в секундах Т: ");
        t = scanner.nextInt();

        hh = t / 60 / 60;

        mm = (t / 60) - (hh * 60);

        ss = t - ((hh * 60 * 60) + (mm * 60));

        System.out.println(hh + "ч " + mm + "м " + ss + "с");

    }

}
