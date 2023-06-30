package ua.hilel.lesson4.arrays.loops;

public class loopsFor {
    public static void main(String[] args) {
        forEachExampleWithArray();
    }

    public static void forExample() {
        for (int i = 1; i <= 5;
             i++) {
            System.out.println("Maks");

        }

    }

    public static void forExample2() {
        for (int i = 3; i >= -3;
             i--) {
            System.out.println(i); //цикл for працює від 3 до -3 згідно умов
        }
    }

    public static void forExampleArray() {
        int[] arr = {2, 4, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void forEachExampleWithArray(){
        int [] arr= {2,4,6};
        for (int i: arr) {
            System.out.println(i);
        }

    }

    public static void forEachExampleWithArray2() {
        String[] arrayStr = {"Igor", "Kostya", "Sasha" };
        for (String names : arrayStr) {
            System.out.println(names + " " + "Petrov");
        }
    }
}