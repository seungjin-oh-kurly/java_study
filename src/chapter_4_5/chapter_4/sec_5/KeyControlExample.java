package chapter_4_5.chapter_4.sec_5;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        int speed = 0;
        while (run) {
            System.out.println("1. 증속, 2 감속, 3 중지");
            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                speed++;
                System.out.println("speed = " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("speed = " + speed);
            } else if (strNum.equals("3")) {
                run = false;
            }
        }

        end:
        System.out.println("종료" );



    }
}

