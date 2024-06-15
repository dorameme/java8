package hello.java8_6;

public class App {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("Hello~");

        Thread thread=new Thread(()->{

                System.out.println(Thread.currentThread().getName());
                try{
                    Thread.sleep(1000L);
                }catch(InterruptedException e){
                    System.out.println("interrupted!");
                    return;
                }

        });
        thread.start();
        System.out.println("hello"+Thread.currentThread().getName());
        Thread.sleep(3000L);
        thread.join();
        thread.interrupt();
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("Thread!");
        }
    }
}
