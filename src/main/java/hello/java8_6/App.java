package hello.java8_6;

public class App {

    public static void main(String[] args) throws InterruptedException {
        //멀티스레드 1. Thread를 상속받아 override해서 구현!
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("hello?:"+Thread.currentThread().getName());
    }
    static class MyThread extends  Thread{

        @Override
        public void run() {
            System.out.println("thread:"+ Thread.currentThread().getName());
        }
    }
}