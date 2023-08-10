package chapter_4_5.chapter_4.sec_7;

public class BreakExample {

    public static void main(String[] args) {

        while (true) {
            int num = (int) (Math.random() * 6) + 1;

            System.out.println("num = " + num);

            if (num == 6) {
                break;
            }
        }
    }
}
