package chapter_2.sec_1;

public class VariableUseExample {
    public static void main(String[] args) {

        int hour = 3;
        int minute = 5;

        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);

        int totalMinute = (hour * 60) + minute;
        System.out.println("totalMinute = " + totalMinute);
    }
}