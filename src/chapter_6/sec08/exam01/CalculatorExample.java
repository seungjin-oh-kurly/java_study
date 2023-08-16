package chapter_6.sec08.exam01;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.powerOn();

        int result1 = calculator.plus(5, 4);

        System.out.println("result1 = " + result1);

        int x = 10;
        int y = 4;

        double result2 = calculator.divide(x, y);
        System.out.println("result2 = " + result2);

        calculator.powerOff();
    }
}
