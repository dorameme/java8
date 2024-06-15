package hello.java8_6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {

    //2.new Runnable을 람다로 넘겨준다!
    public static void main(String[] args) {
        Thread thread=new Thread(
            () -> System.out.println("thread:" +Thread.currentThread().getName()));
        thread.start();
        System.out.println("hello"+Thread.currentThread().getName());
    }

}
