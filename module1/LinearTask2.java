package by.javaonline.module1;

/*
    Вычислить значение выражения по формуле (все
    переменные принимают действительные значения):
    b + sqrt(b^2 + 4 * a * c)
    ------------------------- * a^3 * c + b^-2 ;
              2 * a
*/

public class LinearTask2 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double result;
        double temp;

        a = 3.7;
        b = 4.7;
        c = 8.7;

        temp = b + Math.sqrt(Math.pow(b, 2)+ 4*a*c); //Числитель дроби
        temp = temp / (2*a); //Знаменатель дроби
        temp = temp - Math.pow(a, 3)*c + Math.pow(b, -2);

        result = temp;
        System.out.println("Result: " + result);

    }
}