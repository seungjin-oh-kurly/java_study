package chapter_6.sec15;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        return singleton;
    }
}
