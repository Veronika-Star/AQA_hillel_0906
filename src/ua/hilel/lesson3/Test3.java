package ua.hilel.lesson3;

public class Test3 {
    public static void main(String[] args) {
        int price = 5;
        int apple = 2;
        apple++;
        int d=price*apple;
        System.out.println(d);

        int b=price*--apple;
        System.out.println(b);

        apple+=4;
        b=price--*apple;
        System.out.println(b);
    }
}
