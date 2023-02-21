package src.main.java.test;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        Test.b = Test.b+1;

        System.out.println(Test.b);
    }


}
