package ua.hilel.lesson3;

public class ConditionExample {
    public static void main(String[] args) {
        method2();
    }
        public static void method2() {
            int a = 6;
            int b = 7;

            if (a == b) {
                System.out.println("digits are same");

                } else if (a > b) {
                    System.out.println("a greater then b");
                }else {
                    System.out.println("a less then b");
            }
        }



    public static void method() {
        int a = 6;
        int b = 6;
        if (a == b) {
            System.out.println("digits are same");
        } else {
            System.out.println("digits are not same");
        }
        ;
    }
}

