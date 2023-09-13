package chapter_11.sec02.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.String");
            System.out.println("클래스 존재");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("java.lang.String2");
            System.out.println("클래스 존재");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
