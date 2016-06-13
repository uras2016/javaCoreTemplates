package Threads.LectionsGoJava;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.stream.IntStream;

public class Synchronizers_CyclicBarrierAndExchanger {

    public static void main(String[] args) throws InterruptedException {
        Synchronizers_CyclicBarrierAndExchanger synchronizers = new Synchronizers_CyclicBarrierAndExchanger();
//        synchronizers.testCyclicBarrier();
        synchronizers.testExchanger();


    }






    // собирает несколько(5) потоков и потом все отпускает
    public void testCyclicBarrier() throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5,() -> System.out.println("Barrier exceeded"));
        // () -> - this is Runnable. It will be run after we get 5th thread but before their exit.

        while (true){
            new Thread(() -> {
                try {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + "starts waiting on barrier");
                    cyclicBarrier.await();

                    System.out.println(threadName + "finish waiting");

                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }


            }).start(); // () -> {}  as new Runnable
            Thread.sleep(1000);

        }

    }


    public void testExchanger(){
        Exchanger<String> exchanger = new Exchanger<>();
        Random random = new Random();

        IntStream.range(0, 2).forEach((i) -> new Thread(() -> {
            try {
                Thread.sleep(random.nextInt(1000));
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " is ready to exchange");
                System.out.println(threadName + "< - >" + exchanger.exchange(threadName));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start());
    }

}
