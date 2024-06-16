package hello.java8_6;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App4 {
//  결과리턴가능
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        Callable<String> hello= ()->{
            Thread.sleep(2000L);
            return "Hello";
        };Callable<String> hello2= ()->{
            Thread.sleep(3000L);
            return "Hello";
        };Callable<String> hello3= ()->{
            Thread.sleep(4000L);
            return "Hello";
        };

        List<Future<String>> futures = executorService.invokeAll(
            Arrays.asList(hello, hello2, hello3));
            futures.forEach(System.out::println);
        //invokeAll은 모든게 끝날때까지 기다린다.
        Future<String> submit=executorService.submit(hello);

        System.out.println("Start");

        submit.get();
        System.out.println("End");
        executorService.shutdown();
    }
}
