package Threads.lectionsBaumana;

public class RandomRunExample extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public void example(){
        for (int i =0; i<10;i++){
            Thread thread = new RandomRunExample();
            thread.start();

        }
    }
}
