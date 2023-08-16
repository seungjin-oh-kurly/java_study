package chapter_6.sec09;

public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run(){
        this.setSpeed(100);
        System.out.println("model = " + model);
        System.out.println("speed = " + speed);
    }
}

