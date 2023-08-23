package chapter_7.sec09;

public class InstanceofExample {

    public static void personInfo(Person person){
        System.out.println("person = " + person.name);
        person.walk();

        if(person instanceof Student student){
            System.out.println("student.studentNo = " + student.studentNo);
            student.study();
        }

    }

    public static void main(String[] args){
        Person p1 = new Person("홍길동");
        personInfo(p1);

        Student p2 = new Student("김길동", 10);
        personInfo(p2);
    }



}
