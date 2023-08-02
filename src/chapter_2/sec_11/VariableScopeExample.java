package chapter_2.sec_11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        }

        //int v3 = v1 + v2 + 5; //v2에 접근이 되지 않아 컴파일 에러 발생
    }
}
