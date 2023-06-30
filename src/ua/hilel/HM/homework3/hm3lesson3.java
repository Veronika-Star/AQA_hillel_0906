package ua.hilel.HM.homework3;

import java.util.Scanner;

public class hm3lesson3 {
    public static void main(String[] args)
    {
        Scanner numbers = new Scanner(System.in);
        System.out.println("вести число на выбор 1,2,3");
        int number = numbers.nextInt();
        if (number >=1  && number<=3)// (number == 1||number==2||number==3)
         {
            System.out.println("вы ввели число " +number);
        }
        else
        {
        System.out.println("вы ввели число не равно 1,2,3 " );
        }




    }
}
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
// 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь:
// 1, 2, или 3 и в том случаи, если пользователь ввёл какое-либо другое число
// программа должна отвечать „Вы ввели число не равное 1, 2 или 3“
