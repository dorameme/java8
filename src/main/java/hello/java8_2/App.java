package hello.java8_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {
        List<String> name =new ArrayList<>();
        name.add("1");
        name.add("2");
        name.add("3");
        name.add("4");
        name.add("5");
        name.forEach(System.out::println);//이터레이터

        // stream의 기반에 spliterator 가 있다.
        Spliterator<String> spliterator = name.spliterator();//쪼갤수 있는  이터레이터
        Spliterator<String> spliterator1=spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("-----------------------");
        while(spliterator1.tryAdvance(System.out::println));

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        //여러조건으로 비교가능!
        name.sort(String::compareToIgnoreCase);
        name.sort(compareToIgnoreCase.thenComparing(compareToIgnoreCase));
    }
}
