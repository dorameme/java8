package hello.java8;

@FunctionalInterface
public interface RunSomething {
    //함수형 인터페이스 (인터페이스에 함수가 1개) but static, default 는 상관없다!
    abstract void doIt(); //(abstract 생략가능)

    static void printName(){
        System.out.println("김연수");
    }
    default  void printAge(){
        System.out.println(20);
    }
}
