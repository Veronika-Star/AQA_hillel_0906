package ua.hilel.lesson4.arrays.loops;

public class LoopsWhile {
    public static void main(String[] args) {
        whileExample2();
    }

    public static void whileExample() {
        int i = 1;
        while (i < 10) {

            System.out.println(i + " ");
            i++;

        }
    }


    public static void whileExample2() {
        int i = 100;
        while (i >= 10) {

            System.out.println("Обратный отсчет " + i + " ");
            i-=10; //i=i-10;

        }
    }

}

// whileExample условие выполняется пока i больше 10(бесконечно), если добавить инкремент i++
//то цикл дойдет до 9 и прекратится (каждый раз увеличивается на 1 пока не дойдет до 10)