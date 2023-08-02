package chapter_2.sec_3;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;

        char c3 = '가';
        char c4 = 44032;

        char c5 = ' '; // 빈 문자는 컴페일 에러가 나서 공백(32)을 넣어줘야한다.
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
    }
}
