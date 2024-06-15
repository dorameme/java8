package hello.java8_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App2 {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(javaClasses);


        System.out.println("spring 으로 시작하는 수업");
        System.out.println(keesunEvents.stream().flatMap(List::stream).map(OnlineClass::getTitle).filter(c->c.startsWith("spring"))
            .collect(Collectors.toList()));

        System.out.println("close 되지 않은 수업");
        System.out.println(keesunEvents.stream().flatMap(List::stream).filter(c -> !c.isClosed())
            .collect(Collectors.toList()));
        //함수형 인터페이스와 람다 사용
        keesunEvents.stream().flatMap(List::stream).filter(Predicate.not(OnlineClass::isClosed)).forEach(oc-> System.out.println(oc.getTitle()));

        System.out.println("수업 이름만 모아서 스트림 만들기");
        keesunEvents.stream().flatMap(List::stream).map(OnlineClass::getTitle).forEach(System.out::println);

        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        System.out.println(keesunEvents.stream().flatMap(List::stream).map(OnlineClass::getId)
            .collect(Collectors.toList()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        //스트림의 이터레이터 사용
        Stream.iterate(10,i->i+1).skip(10).limit(10).forEach(System.out::println);

        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");

            javaClasses.stream().map(OnlineClass::getTitle).filter(s -> s.contains("Test")).forEach(System.out::println);

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기");
        System.out.println(
            springClasses.stream().map(OnlineClass::getTitle).filter(s -> s.contains("spring"))
                .collect(
                    Collectors.toList()));
    }

}