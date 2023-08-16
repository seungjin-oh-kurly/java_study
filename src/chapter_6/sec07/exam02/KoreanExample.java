package chapter_6.sec07.exam02;

public class KoreanExample {

    public static void main(String[] args) {
        Korean korean = new Korean("박자바", "011225-1234567");
        System.out.println("korean.nation = " + korean.nation);
        System.out.println("korean.name = " + korean.name);
        System.out.println("korean.ssn = " + korean.ssn);

        Korean korean2 = new Korean("박자바2", "011225-1234567");
        System.out.println("korean2.nation = " + korean2.nation);
        System.out.println("korean2.name = " + korean2.name);
        System.out.println("korean2.ssn = " + korean2.ssn);
    }
}
