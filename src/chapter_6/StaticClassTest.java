package chapter_6;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StaticClassTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Test test1 = new Test(128);
        Test test2 = new Test(256);

        Class<? extends Test> test1Class = test1.getClass();
        Class<? extends Test> test2Class = test2.getClass();

        System.out.println("test1Class hashCode= " + test1Class.hashCode());
        System.out.println("test2Class hashCode= " + test2Class.hashCode());

        System.out.println(Test.class);
        Class<?> test = Class.forName("chapter_6.StaticClassTest$Test");
        Constructor<?> declaredConstructor = test.getDeclaredConstructors()[0];
        Test o = (Test)declaredConstructor.newInstance(123);
        o.print();
    }

    static class Test{
        private int testVariable;

        public Test(int tempVariable){
            testVariable=tempVariable;
        }

        void print(){
            System.out.println("testVariable = " + testVariable);
        }
    }
}
