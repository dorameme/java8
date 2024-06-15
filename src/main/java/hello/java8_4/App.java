package hello.java8_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses =new ArrayList<>();
        springClasses.add(new OnlineClass(1,"springboot",true));
        springClasses.add(new OnlineClass(2,"spring",false));
        springClasses.add(new OnlineClass(3,"boot",true));

        Optional<OnlineClass> spring = springClasses.stream()
            .filter(oc -> oc.getTitle().startsWith("spring")).findFirst();

        spring.ifPresent(oc-> System.out.println(oc.getTitle()));
        OnlineClass book = spring.orElse(new OnlineClass(4, "book", true));
    }
}
