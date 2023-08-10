package chapter_4_5.chapter_4.sec_4;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for(i= 1; i<=100; i++){
            sum +=i;
        }

        System.out.println(sum);
    }
}
