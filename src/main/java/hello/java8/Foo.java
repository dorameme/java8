package hello.java8;

public class Foo {

    public static void main(String[] args) {
        int baseNum=1;
        //익명 내부 클래스
        RunSomething runSomething= () -> {
//            baseNum=10; -> 밖은 참조만 하자! final 이라고 가정하기때문에!!
            System.out.println("im yunsoo");
            System.out.println("hello");//lambda
        };
    }
}
