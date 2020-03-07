package by.javaonline.module1;

/*
    Дано действительное число R вида nnn.ddd (три цифровых знака в дробной
    и целой частях). Поментяь местами дробную и целую части числа и вывести
    полученное значение числа.
*/

public class LinearTask4 {

    public static void main(String[] args) {

        double r;
        double tempNNN;
        double tempDDD;
        double result;

        r = 347.873; // исходное значение числа R
        System.out.println("R = " + r);

        tempNNN = Math.floor(r); // Находим значение nnn
        System.out.println("nnn: " + tempNNN);

        tempDDD = Math.ceil((r - tempNNN) * 1000); // Находим значение ddd
        System.out.println("ddd: " + tempDDD);

        result = tempDDD + tempNNN/1000; // Находим требуемое значение
        System.out.println("Result: " + result);

    }
}