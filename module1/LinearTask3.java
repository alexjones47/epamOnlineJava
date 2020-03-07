package by.javaonline.module1;

/*
    Вычислить значение выражения по формуле (все
    переменные принимают действительные значения):
    sin x + cos y
   ---------------- * tg xy;
    cos x - sin y
*/

public class LinearTask3 {

    public static void main(String[] args) {

        double x;
        double y;
        double result;
        double temp;

        x = 3.7;
        y = 4.7;

        temp = Math.sin(x) + Math.cos(y); //Числитель дроби
        temp = temp / (Math.cos(x) - Math.sin(y)); //Знаменатель дроби
        temp = temp * Math.tan(x*y);

        result = temp;
        System.out.println("Result: " + result);

    }
}
