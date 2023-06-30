package ua.hilel.HM.homework3;

import java.util.Scanner;

public class hm2lesson3 {
    public static void main(String[] args) {

        System.out.println("ввести число 1");
        Scanner number1 = new Scanner(System.in);
        int k = number1.nextInt();

        if (k == 1) {
            System.out.println("вы ввели число 1");
        } else if (k != 1) {
            System.out.println("вы ввели число не равно 1");
        }
    }
}


// Необходимо написать программу, где бы пользователю предлагалось ввести число 1.
// Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
// Если пользователь ввёл другое число,
// программа должна вывести такое сообщение: "Вы ввели число не равное 1"

