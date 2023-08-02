package chapter_2.sec_13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");

        String strX = scanner.nextLine();

        System.out.print("y값 입력: ");

        String strY = scanner.nextLine();

        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y = " + result);
        System.out.println();

        while(true){
            System.out.println("입력 문자열: ");
            String data  = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("data = " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
