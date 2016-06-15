package Threads.semaphor;

public class Worker2 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " starts working...");
//            CountDownLatch.await();

        }
        catch (Exception e) {
        }
    }
}