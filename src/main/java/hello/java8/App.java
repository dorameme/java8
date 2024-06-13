package hello.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {


    public static void main(String[] args) {
        //함수 정의
        Function<String, Greeting> greetingFunction = Greeting::new;
        Supplier<Greeting> newGreeting = Greeting::new;

        Greeting name = greetingFunction.apply("kimyunsoo");
        System.out.println(name.getName());

        String[] names= {"one","two","three"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

}
