package chapter_7.sec02;

public class SmartPhone extends Phone {

    public boolean wifi;

    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
