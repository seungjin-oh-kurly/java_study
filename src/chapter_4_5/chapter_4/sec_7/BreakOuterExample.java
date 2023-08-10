package chapter_4_5.chapter_4.sec_7;

public class BreakOuterExample {

    public static void main(String[] args) {
        outer: for(char upper ='A'; upper<='Z'; upper++){
        for(char lower = 'a'; lower <='z';lower++){
            System.out.println("upper = " + upper + " lower = "+lower);

            if(lower=='g'){
                break outer;
            }
        }

        }
    }
}
