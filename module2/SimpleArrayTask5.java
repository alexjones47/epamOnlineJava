package by.javaonline.module2;

/*
    Даны целые числа a1, a2, ... , an.
    Вывести на печать только те числа, для которых ai > i.
*/

public class SimpleArrayTask5 {

    public static void main(String[] args) {

        int[] array = new int[]{0, 8, 10, 3, 7, 1, 15, 37, 4};

        System.out.println("Выводим на экран исходный массив: ");
        arrayPrint(array);

        System.out.println("\nРезультат сортировки исходного массива: ");
        arraySorting(array);
    }


    public static void arrayPrint(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void arraySorting(int[] array){

        for(int i = 0; i < array.length; i++){
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }

}

