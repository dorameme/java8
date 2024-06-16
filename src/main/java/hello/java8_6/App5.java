package hello.java8_6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App5 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Future->예외처리 api없고 조합도 어렵고..
        //
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> future = executorService.submit(() -> "hello");
        //future하고 get하기전까지 (리턴가지고가기 전까지) 아무것도 못함!
        future.get();//블록킹 콜
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.complete("hello");
        System.out.println(completableFuture.get());
    }
}
