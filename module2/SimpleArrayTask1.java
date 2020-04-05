package by.javaonline.module2;

/*
    В массиве A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
*/

public class SimpleArrayTask1 {

    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int k;
        int sum;

        k = 3;
        sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum = sum + a[i];
            }
        }

        System.out.println("Сумма элементов, кратных k = " + k + " равна " + sum);

    }

}
