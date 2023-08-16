package chapter_6.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("car = " + car.company);
        System.out.println("car = " + car.model);
        System.out.println("car = " + car.color);
        System.out.println("car = " + car.maxSpeed);
        System.out.println("car = " + car.speed);

        car.speed = 60;

        System.out.println("car = " + car.speed);
    }
}
