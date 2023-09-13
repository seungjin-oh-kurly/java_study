package chapter_11.sec03.exam03;

public class ExceptionHandling {
    public static void main(String[] args) {

        String[] array = {"100", "1oo", null, "200"};

        for(int i = 0; i < array.length+1;i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("value = " + value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("e.getMessage() = " + e.getMessage());
            }catch (NumberFormatException |NullPointerException e){
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }
    }
}
