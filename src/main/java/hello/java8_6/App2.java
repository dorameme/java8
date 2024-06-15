package hello.java8_6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {

    public static void main(String[] args) {
        //single thead
        ExecutorService executorService=  Executors.newFixedThreadPool(2);
        executorService.submit(getRunnable("1"));
        executorService.submit(getRunnable("2"));
        executorService.submit(getRunnable("3"));
        executorService.submit(()->{
            System.out.println("Thread"+ Thread.currentThread().getName());
        });
        //executor는 명시적 종료가 필요하다.(graceful)
        executorService.shutdown();
    }
    private static Runnable getRunnable(String message){
        return ()-> System.out.println(message+Thread.currentThread().getName());
    }
}
