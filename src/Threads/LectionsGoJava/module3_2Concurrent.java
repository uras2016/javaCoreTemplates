package Threads.LectionsGoJava;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class module3_2Concurrent {

    private Lock lock = new ReentrantLock();
    public void test(){
        lock.lock();
        try {
            //
        }finally {

            lock.lock();

        }
    }
}
