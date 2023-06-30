package ua.hilel.HM.homework4;

public class hm5lesson4 {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        int a = 3;
        for (int b = 1; b <= 10; b++) {
            System.out.println(a +"*" + b + "=" +a * b);
        }
    }
}


//Необходимо вывести на экран таблицу умножения на 3 с помощью цикла for:
//3*1=3
//3*2=6
//3*3=9
//3*4=12
//3*5=15
//3*6=18
//3*7=21
//3*8=24
//3*9=27
//3*10=30