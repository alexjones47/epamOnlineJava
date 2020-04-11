package by.javaonline.module2;

/*
    Даны действительные числа A1, A2, ... , A2n.
    Найти max (A1 + A2n, A2+A(2n-1), ... , An + A(n+1)).
*/

public class SimpleArrayTask7 {
    public static void main(String[] args) {

        double[] array = new double[]{10.3, 97.3, 13.8, 17.8, 83.7, 7.8, 4.7, 8.3};

        System.out.println("Выводим на экран исходный массив: ");
        arrayPrint(array);

        double[] resultArray = new double[array.length / 2];

        resultArrayInit(resultArray, array);

        System.out.println("\nВыводим на экран полученный массив: ");
        arrayPrint(resultArray);

        System.out.print("\nМаксимальный элемент массива: " + maxItemInArray(resultArray));
    }

    public static void arrayPrint(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }

    public static void resultArrayInit(double[]resultArray , double[]array) {
        for (int i = 0; i < array.length; i++) {
            if (i < (array.length / 2)) {
                resultArray[i] = array[i] + array[array.length-(i+1)];
            }
        }
    }

    public static double maxItemInArray(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
