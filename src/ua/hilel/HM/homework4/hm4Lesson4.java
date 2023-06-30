package ua.hilel.HM.homework4;

public class hm4Lesson4 {
    public static void main(String[] args) {
        numbersAdittion();
    }

    public static void numbersAdittion() {
        int i = 1;
        while ( i<=512){
            System.out.print(i + " ");
            i *= 2;
        }

    }
}
//Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
//1 2 4 8 16 32 64 128 256 512