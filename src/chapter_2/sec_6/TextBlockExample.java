package chapter_2.sec_6;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";
        String str2 = """
                   {
                       "id":"winter",
                       "name":"눈송이"
                   }
                   """;

        System.out.println("str1 = " + str1);
        System.out.println("------------------------------------");
        System.out.println("str2 = " + str2);
        System.out.println("------------------------------------");

        String str3 = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될겁니다.
                """;
        System.out.println(str3);

    }
}
