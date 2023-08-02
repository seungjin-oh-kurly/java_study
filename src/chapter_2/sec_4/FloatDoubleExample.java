package chapter_2.sec_4;

public class FloatDoubleExample {
    public static void main(String[] args) {

        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        double var3 = 3e6;
        float var4 = 3e6f; // var3와 비교할 때, var4는 double로 변환되어 비교된다. 이 두 수의 근사치가 같아서 var3==var4는 true로 나온다.
        double var5 = 2e-3;

        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

    }
}
