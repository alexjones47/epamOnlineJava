package by.javaonline.module1;

import java.util.Scanner;

/*
    Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
    Определить, пройдет ли кирпич через отвесртие.
*/

public class ConditionTask4 {
    public static void main(String[] args) {

        int a;
        int b;
        int x;
        int y;
        int z;
        int maxHoleSide;
        int minHoleSide;
        int maxBrickSide;
        int minBrickSide;
        int averageBrickSide;
        String succes = "\nКирпич размером %dх%dх%d пройдет в отверстие размером %dх%d";
        String unsucces = "\nКирпич размером %dх%dх%d не пройдет в отверстие размером %dх%d";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину x кирпича: ");
        x = scanner.nextInt();
        System.out.print("Введите длину y кирпича: ");
        y = scanner.nextInt();
        System.out.print("Введите длину z кирпича: ");
        z = scanner.nextInt();
        System.out.println();
        System.out.print("Введите длину стороны A отверстия: ");
        a = scanner.nextInt();
        System.out.print("Введите длину стороны B отверстия: ");
        b = scanner.nextInt();

        maxHoleSide = Math.max(a,b);
        minHoleSide = Math.min(a,b);

        maxBrickSide = Math.max(Math.max(x, y), Math.max(z, y));
        minBrickSide = Math.min(Math.min(x, y), Math.min(z, y));
        averageBrickSide = x + y + z - maxBrickSide - minBrickSide;

        if (maxHoleSide >= maxBrickSide && minHoleSide >= minBrickSide) {
            System.out.printf(succes, x, y, z, a, b);
        } else if (maxHoleSide >= averageBrickSide && minHoleSide >= minBrickSide) {
            System.out.printf(succes, x, y, z, a, b);
        } else if (maxHoleSide >= maxBrickSide && minHoleSide >= averageBrickSide) {
            System.out.printf(succes, x, y, z, a, b);
        } else {
            System.out.printf(unsucces, x, y, z, a, b);
        }

    }
}
