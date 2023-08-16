package chapter_6.sec07.exam05;

public class CarExample {

    public static void main(String[] args) {
        Car car1 = new Car("자가용");
        System.out.println("car1 = " + car1);

        Car car2 = new Car("자가용", "빨강");
        System.out.println("car2 = " + car2);

        Car car3 = new Car("택시", "검정", 200);
        System.out.println("car3 = " + car3);
    }
}
