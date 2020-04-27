package by.javaonline.module2;

/*
    В массиве целых чисел, с количеством элементов n найти наиболее
    часто встречающееся число. Если таких чисел несколько, то определить
    наименьшее из них
*/

public class SimpleArrayTask9 {

    public static void main(String[] args) {


        int[] array = new int[]{5, 9, 3, 1, 3, 1, 3, 1, 4, 2, 8, 1, 1, 3, 2, 2};

        System.out.println("Выводим на экран исходный массив: ");
        printArray(array);

        System.out.println("\nРезультат: ");
        System.out.println(findMinItem(array));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static int findMinItem(int[] array) {

        int counterOfClones = 0;
        int minItem = array[0];

        for (int i = 0; i < array.length; i++) {

            int counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }

            if (i == 0) {
                counterOfClones = counter;
            } else {

                if (counter > counterOfClones ) {
                    counterOfClones = counter;
                    minItem = array[i];

                } else if (counter == counterOfClones && array[i] < minItem) {
                    minItem = array[i];
                }
            }
        }
        return minItem;

    }
}
