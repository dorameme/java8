package hello.java8;

public interface DefaultFoo {
    void printName();

    default void printNameUpperCase(){
        System.out.println("FOO");
    }// 디폴트 메소드로 하위 클래스들이 같은 기능을 가지게 함!

}
