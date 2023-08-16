package chapter_6;


class Test{
    private int testVariable;

    public Test(int tempVariable){
        testVariable=tempVariable;
    }
}
public class ClassTest {
    public static void main(String[] args) {

        Test test1 = new Test(128);
        Test test2 = new Test(256);

        Class<? extends Test> test1Class = test1.getClass();
        Class<? extends Test> test2Class = test2.getClass();

        System.out.println("test1Class hashCode= " + test1Class.hashCode());
        System.out.println("test2Class hashCode= " + test2Class.hashCode());
    }

}


