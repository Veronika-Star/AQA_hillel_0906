package ua.hilel.HM.homework4;

public class hm2Lesson4 {
    public static void main(String[] args) {
        loopsWhile();
    }

    public static void loopsWhile() {
        int i = 100;
        while (i >= 10) {
            System.out.print(i + " ");
            i -= 10;
        }

    }
}
//Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:

//100 90 80 70 60 50 40 30 20 10