package chapter_6.sec13.exam02.package1;

public class A {
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    public A(boolean b) {

    }
    A(int b){

    }

    private A(String s){

    }

    public static void main(String[] args) {
        A a = new A("1");
    }

}
