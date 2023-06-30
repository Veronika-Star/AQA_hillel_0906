package ua.hilel.HM.homework2;

import java.util.Scanner;

public class hm3lesson3switch {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("ввести число на выбор 1,2,3");
        int number = numbers.nextInt();

        switch (number){
        case 1:
        System.out.println("вы ввели число 1");
            break;
        case 2:
        System.out.println("вы ввели число 2");
            break;
        case 3:
        System.out.println("вы ввели число "+number);
        break;
        default:
            System.out.println("число не равно 1,2,3");

    }
}
    }
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
// 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь:
// 1, 2, или 3 и в том случаи, если пользователь ввёл какое-либо другое число
// программа должна отвечать „Вы ввели число не равное 1, 2 или 3“
