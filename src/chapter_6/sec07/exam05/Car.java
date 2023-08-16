package chapter_6.sec07.exam05;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car(String model) {
        this(model, "은색");
    }

    public Car(String model, String color) {
        this(model, color, 250);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "company: %s\nmodel: %s\ncolor: %s\nmaxSpeed: %d".formatted(company, model, color, maxSpeed);
    }
}
