package ua.hilel.lesson3;

import ua.hilel.lesson.lesson2.MyFirstClass;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {
method2();
    }

    public static void method2() {
        System.out.println("Enter any two");
        Scanner scanner = new Scanner(System.in);
        int numberIn1 = scanner.nextInt();
        int numberIn2 = scanner.nextInt();
        int result = numberIn1 + numberIn2;
        System.out.println(result);
    }

    public static void method1() {
        System.out.println("Enter any digit from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int numberIn = scanner.nextInt();
        int result = numberIn + 100;
        System.out.println("You enter " + numberIn);
        System.out.println("Result: " + result);

    }
}

