package chapter_2.sec_6;

public class StringExample {
    public static void main(String[] args) {
        //String은 primitive 타입이 아님. 참조타입으로 선언된 변수는 참조 타입의 객체의 주소를 가지고 있음.
        //carriage return은 커서를 앞으로 옮긴다고 생각하면 된다.

        String name = "홍길동";
        String job = "프로그래머";
        System.out.println("name = " + name);
        System.out.println("job = " + job);


        String str = "나는 \"자바\"를 배웁니다.";

        System.out.println("str = " + str);

        str = "번호\t이름\t직업";
        System.out.println("str = " + str);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.");

    }
}
