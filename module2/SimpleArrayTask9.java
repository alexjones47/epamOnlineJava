package by.javaonline.module2;

/*
    В массиве целых чисел, с количеством элементов n найти наиболее
    часто встречающееся число. Если таких чисел несколько, то определить
    наименьшее из них
*/

public class SimpleArrayTask9 {

    public static void main(String[] args) {


        int[] array = new int[]{1,2,3,4,3,1,3,1,4,2,8,3,1};

        System.out.println("Выводим на экран исходный массив: ");
        printArray(array);

        System.out.println("\nМассив содержащий количество повторений каждого элемента (не учитывая сам элемент): ");

        printArray(arrayOfCountersCloneElements(array));

        System.out.println("\nМассив содержащий индексы максимально повторяющихся элементов: ");

        printArray(findIndexOfMaxElementsInCountersArray(arrayOfCountersCloneElements(array)));

        System.out.println("\nМассив максимально повторяющихся элементов: ");
        findMinItem(array);


    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static int[] arrayOfCountersCloneElements(int[] array) {

        int[] arrayOfCounters = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j){
                    counter++;
                }
            }
            arrayOfCounters[i] = counter;
        }
        return arrayOfCounters;
    }


    public static int[] findIndexOfMaxElementsInCountersArray(int[] array){
        int max = array[array.length-1];
        int countMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] >= max) {
                max = array[i];
                countMax++;
            }
        }
        int[] arrayOfMaxIndex = new int[countMax];
        int indexMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
                arrayOfMaxIndex[indexMax] = i;
                indexMax++;
            }
        }
        return arrayOfMaxIndex;
    }


    public static void findMinItem(int[] array) {
        int countMax = findIndexOfMaxElementsInCountersArray(arrayOfCountersCloneElements(array)).length;
        int[] resultArray = new int[countMax];
        int[] arrayOfIndexes = findIndexOfMaxElementsInCountersArray(arrayOfCountersCloneElements(array));
        int index = 0;
        for (int i = 0; i < array.length && index < countMax; i++) {

            if (i == arrayOfIndexes[index]) {
                resultArray[index] = array[i];
                index++;
            }
        }

        printArray(resultArray);

        System.out.println("\nНаименьшее число из наиболее часто встречающихся: ");
        int minItem = resultArray[0];
        for (int k = 0; k < resultArray.length; k++) {
            if(resultArray[k] < minItem){
                minItem = resultArray[k];
            }
            System.out.println(minItem);
            break;
        }
    }

}
