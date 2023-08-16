package chapter_6.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }

        System.out.println("gas가 있습니다.");
        return true;
    }

    void run(){
        while (true) {
            if(gas > 0){
                System.out.println("run gas = " + gas);
                gas -= 1;
            }
            else{
                System.out.println("stop gas = " + gas);
                return;
            }

        }
    }
}
