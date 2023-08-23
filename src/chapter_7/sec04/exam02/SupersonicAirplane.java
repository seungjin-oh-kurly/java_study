package chapter_7.sec04.exam02;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;


    public int flyMode = NORMAL;

    @Override //런타임시 아무 역할 없음. 그저 컴파일 시, 도움을 주기위해
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}
