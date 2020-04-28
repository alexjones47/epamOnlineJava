package by.javaonline.module2;

/*
    Дан целочисленный массив с количеством элементов n.
    Сжать массив, выбросив из него каждый второй эдемент
    (освободившиеся элементы заполнить нулями).
    Примечание: дополнительный массив не использовать.
*/

public class SimpleArrayTask10 {

    public static void main(String[] args) {

        int[] array = new int[]{1,8,3,4,7,18,8,7,9};

        System.out.println("Выводим на экран исходный массив: ");
        printArray(array);

        analyzeArray(array);

        System.out.println("\nВыводим на экран новый массив: ");
        printArray(array);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void analyzeArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if((i+1) % 2 == 0){
                array[i] = 0;
            }
        }
    }

}
