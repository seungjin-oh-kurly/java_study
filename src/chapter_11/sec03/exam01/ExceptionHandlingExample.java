package chapter_11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("value = " + value);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){

                System.out.println(e.getMessage());
            }
        }

    }
}
