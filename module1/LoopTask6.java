package by.javaonline.module1;

/*
    Вывести на экран соответствие между символами и их численными
    обозначениями в памяти компьютера
*/

public class LoopTask6 {

    public static void main(String[] args) {

        for (int i = 32; i < 127; i++) {
            char ch = (char) i;
            System.out.println("Число " + i + " соответствует символу " + ch);
        }
    }
}
