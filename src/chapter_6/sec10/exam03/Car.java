package chapter_6.sec10.exam03;

public class Car {
    int speed;

    void run(){
        System.out.println("speed = " + speed);
    }

    static void simulate(){
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }

}

