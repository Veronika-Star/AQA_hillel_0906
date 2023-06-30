package ua.hilel.lesson3;

import java.util.Scanner;


public class ScannerExample2 {
    public static void main(String[] args) {
        method2();
    }
        public static void method2(){
        System.out.println("Enter any two digit");
        Scanner scanner = new Scanner(System.in);
        int numberIn1= scanner.nextInt();
        int numberIn2= scanner.nextInt();
        int result=numberIn1+numberIn2;
        System.out.println(result);


    }
}
