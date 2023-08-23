package chapter_7.sec04.exam01;

public class ComputerExample {

    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("calculator.areaCircle(r) = " + calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println("computer.areaCircle(r) = " + computer.areaCircle(r));
    }
}
