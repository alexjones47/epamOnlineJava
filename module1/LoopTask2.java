package by.javaonline.module1;

/*
    Вычислить значение функции на отрезке [a, b] с шагом h:
    y = x,  x>2;
       -x,  x<=2.
*/

public class LoopTask2 {
    public static void main(String[] args) {

        double x;
        double y;
        double a;
        double b;
        double h;

        a = 1;
        b = 4;
        h = 1;

        for (x = a; x <= b; x = x + h) {
            if (x > 2) {
                y = x;
                System.out.println(y);
            }
            else {
                y = -x;
                System.out.println(y);
            }
        }
    }
}
