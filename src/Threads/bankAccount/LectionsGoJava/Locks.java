package Threads.bankAccount.LectionsGoJava;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    private final java.util.concurrent.locks.Lock lock = new ReentrantLock(true);// true guarantees that
    // the earliest thread will be run


    public static void main(String[] args) {
        final Locks locks = new Locks();
        //run in 10 threads

        for (int i = 0; i < 10; i++) {  //
            new Thread(() -> { // (new Runnable)
            }).start();
//            IntStream.range(0, 10).forEach(i -> new Thread(locks::test));
        }
    }

    public void test() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "tries lock");
        try {
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
                try {
                    System.out.println(threadName + "executing critical section");
                    Thread.sleep(20);
                } finally {
                    System.out.println(threadName + "releasing lock");
                    lock.unlock();
                }
            } else {
                System.out.println(threadName + "unable acquire lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
