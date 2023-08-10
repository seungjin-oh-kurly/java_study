package chapter_4_5.chapter_4.sec_8;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i%2!=0)
                continue;
            System.out.println("i = " + i);
        }

    }
}
