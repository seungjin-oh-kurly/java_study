package chapter_7.sec03.exam02;

public class SmartPhone extends Phone {

    public boolean wifi;

    public SmartPhone(String model, String color){
        super(model,color);
        System.out.println("SmartPhone(String model, String color)가 호출됨");
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
