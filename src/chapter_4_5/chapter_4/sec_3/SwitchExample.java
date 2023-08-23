package chapter_4_5.chapter_4.sec_3;
import java.lang.reflect.Field;

public class SwitchExample {


    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        Temp temp = new Temp();

        Class tempclass = temp.getClass();

        System.out.println(tempclass.getTypeName());

        Field[] declaredFields = tempclass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }

        switch (num) {
            case 1 -> System.out.println("1번이 나왔습니다.");
            case 2 -> System.out.println("2번이 나왔습니다.");
            case 3 -> System.out.println("3번이 나왔습니다.");
            case 4 -> System.out.println("4번이 나왔습니다.");
            case 5 -> System.out.println("5번이 나왔습니다.");
            default -> System.out.println("6번이 나왔습니다.");
        }
    }
}
class Temp {
    private int a;
    public Temp(){
        a=1;
    }
}