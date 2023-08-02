package chapter_2.sec_1;

public class VariableExchangeExample {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;

        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}