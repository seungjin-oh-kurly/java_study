package chapter_6.sec14;

public class CarExample {
    public static void main(String[] args) {

        Car car = new Car();

        car.setSpeed(-50);
        System.out.println("car.getSpeed() = " + car.getSpeed());

        car.setSpeed(60);
        System.out.println("car.getSpeed() = " + car.getSpeed());

        if (!car.isStop()) {
            car.setStop(true);
        }
        System.out.println("car.getSpeed() = " + car.getSpeed());

    }
}
