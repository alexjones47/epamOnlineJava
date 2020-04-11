package by.javaonline.module2;

/*
    Дана последовательность целых чисел а1, а2, ... , аn.
    Образовать новую последовательность, выбросив из исходной
    те члены, которые равны min(a1,a2,...,an)
*/

public class SimpleArrayTask8 {

    public static void main(String[] args) {

        int[] array = new int[] {3, 8, 7, 3, 4, 38, 87, 47, 3, 8};

        System.out.println("Выводим на экран исходную последовательность: ");
        arrayPrint(array);

        System.out.println("\nВыводим на экран полученную последовательность: ");
        resultArray(array);

    }

    public static void arrayPrint(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static int arrayMinItem (int[] array) {

        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public  static void resultArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] != arrayMinItem(array)) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}
