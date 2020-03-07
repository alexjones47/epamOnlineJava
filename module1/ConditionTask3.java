package by.javaonline.module1;

/*
    Даны три точки A(x1, y1), B(x2, y2), C(x3, y3).
    Определить, будут ли они расположены на одной прямой.
 */

public class ConditionTask3 {
    public static void main(String[] args) {

        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;

        x1 = 1;
        y1 = 2;
        x2 = 2;
        y2 = 4;
        x3 = 4;
        y3 = 8;

        if ((y3 - y1) / (y2-y1) == ((x3-x1) / (x2 - x1))) {
            System.out.printf("Точки A(%d, %d), B(%d, %d), C(%d, %d) расположены на одной прямой", x1, y1, x2, y2, x3, y3);
        } else {
            System.out.printf("Точки A(%d, %d), B(%d, %d), C(%d, %d) не расположены на одной прямой", x1, y1, x2, y2, x3, y3);
        }

    }
}
