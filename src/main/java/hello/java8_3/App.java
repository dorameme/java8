package hello.java8_3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> name =new ArrayList<>();
        name.add("1");
        name.add("2");
        name.add("3");
        name.add("4");
        name.add("5");
        // 스트림을 쓰면 간단하게 자료들을 처리해 줄 수 있다.
        //스트림은 원본을 바꾸지않는다.
        //중계형 오퍼레이션은 lasy하다. -> 바로실행하지 않는다! 일단 정의만함!
        //종료형 오퍼레이션이 와야 실행되고 끝난다.
        System.out.println(name.stream().map(String::toUpperCase).collect(Collectors.toList()));

        //병렬처리는 데이트가 방대할때 유용
        name.parallelStream().forEach(System.out::println);
    }
}
