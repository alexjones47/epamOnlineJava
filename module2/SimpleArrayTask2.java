package by.javaonline.module2;

/*
    Дана последовательность действительных чисел a1, a2, ... , an.
    Заменить все ее члены, большие данного Z, этим числом.
    Подсчитать количество замен.
*/

public class SimpleArrayTask2 {

    public static void main(String[] args) {

        double[] array = new double[]{1.0, 4.0, -14.0, 24.0, 18.8, 12.0, 47.0, 14.0};

        int z = 13;

        int count = 0;

        System.out.println("Первоначальный массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

        System.out.println("\nИзмененный массив: ");

        for (int i = 0; i < array.length; i++) {

            if (array[i] > z) {
                array[i] = z;
                count++;
            }

            System.out.print(array[i] + "   ");
        }

        System.out.println("\nКоличество замен: " + count);

    }
}
