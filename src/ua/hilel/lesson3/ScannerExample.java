package ua.hilel.lesson3;

import ua.hilel.lesson.lesson2.MyFirstClass;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("Enter any digit from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int numberIn= scanner.nextInt();
        int result=numberIn+100;
        System.out.println("You enter " +numberIn);
        System.out.println("Result: "+ result);

    }
}
