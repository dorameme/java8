package hello.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {
        Plus10 plus10=new Plus10();//함수형 인터페이스 구현.
        System.out.println(plus10.apply(10));

        Function<Integer,Integer> plus1=(i)->i+1; //함수형 인터페이스 람다구현.
        System.out.println(plus1.apply(10));

        Function<Integer,Integer> multiply = i ->i*2;//함수형 인터페이스 람다구현.

        //default함수 compose를 이용하여 고차원 함수로 사용.
        Function<Integer, Integer> compose = plus1.compose(multiply);
        System.out.println(compose.apply(1));

        Function<Integer, Integer> andThen = plus1.andThen(multiply);
        System.out.println(andThen.apply(1));
        //consumer는 output이 없다. 메소드 레퍼런스로 구현
        Consumer<Integer> printT = System.out::println;
        printT.accept(10);

        Supplier<Integer> supply= ()->10;
        System.out.println(supply.get());

        Predicate<String> startWithKim = (s) -> s.startsWith("Kim");
        System.out.println(startWithKim.test("Kim"));
        //입력값과 결과값의 타입이 같은 경우
        UnaryOperator<Integer> plus100= (i) -> i+100;
        System.out.println(plus100.apply(10));
    }
}
