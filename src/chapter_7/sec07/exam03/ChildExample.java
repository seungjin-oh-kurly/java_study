package chapter_7.sec07.exam03;

public class ChildExample {

    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
