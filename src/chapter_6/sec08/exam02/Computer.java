package chapter_6.sec08.exam02;

public class Computer {
    int sum(int ...values){
        int sum =0;
        for (int value : values) {
            sum += value;
        }

        return sum;
    }
}
