package chapter_4_5.chapter_4.sec_2;

public class IfExample {
    public static void main(String[] args) {
        /*
          if 문의 statement block {}은 생략하지 않는 것이 가독성에 좋다.
         */
        int score = 93;
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if(score < 90){
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }

    }
}
