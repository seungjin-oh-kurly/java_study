package chapter_4_5.chapter_4.sec_5;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum =0;
        int i = 1;

        while(i<=100){
            sum +=i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
