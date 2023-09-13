package chapter_11.sec04;

public class MyResource implements AutoCloseable {

    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("열기: name = " + name);
    }

    public String read1() {
        System.out.println("name = " + name);
        return "100";
    }

    public String read2() {
        System.out.println("name = " + name);
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("닫기: name = " + name);
    }
}
