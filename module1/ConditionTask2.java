package by.javaonline.module1;

/*
    Найти max{min(a, b), min(c, d)}
 */

public class ConditionTask2 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double d;
        double temp1;
        double temp2;

        a = 7.8;
        b = 8.7;
        c = 4.7;
        d = 3.8;

        if (a < b) {
            temp1 = a;
        } else {
            temp1 = b;
        }

        if (c < d) {
            temp2 = c;
        } else {
            temp2 = d;
        }

        if (temp1 > temp2) {
            System.out.println(temp1);
        } else {
            System.out.println(temp2);
        }

    }
}
