package chapter_7.sec03.exam02;

public class Phone {

    public String model;
    public String color;

    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color)");
        //기본생성자는 무조건 추가되는데, 다른 생성자가 없을시에는 명시적으로 선언해줘야한다.
    }

    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message){
        System.out.println("자기: "+ message);
    }

    public void receiveVoice(String message){
        System.out.println("상대방: " + message);
    }

    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
