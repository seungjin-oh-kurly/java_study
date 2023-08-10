package chapter_4_5.chapter_4.sec_3;

public class SwitchValueExample {

    public static void main(String[] args) {
        String grade = "B";
        int score = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                yield 100 - 20;
            }
            default -> 0;
        };

        System.out.println("score = " + score);

    }


}
