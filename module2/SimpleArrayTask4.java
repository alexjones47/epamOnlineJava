package by.javaonline.module2;

/*
    Даны действительные числа a1, a2, ... , an.
    Поменять местами наибольший и наименьший элементы.
*/

public class SimpleArrayTask4 {

    public static void main(String[] args) {
        double[] array = new double[]{10.3, 97.3, 13.8, 37.4, 83.7, 7.8};

        System.out.println("Выводим на экран исходный массив: ");
        arrayPrint(array);

        changeMinAndMax(array);

        System.out.println("\nВыводим на экран полученный массив: ");
        arrayPrint(array);
    }


    public static void arrayPrint(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }


    public static void changeMinAndMax(double[] array) {

        double max = array[0];
        int maxIndex = 0;

        double min = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        array[maxIndex] = min;
        array[minIndex] = max;
    }
}
