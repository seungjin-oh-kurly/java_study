package chapter_11.sec02.exam01;

public class ExceptionHandlingExample1 {

    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("마무리");
        }

    }

    public static void main(String[] args) {

        printLength("ThisIsJava");
        printLength(null);
    }
}
