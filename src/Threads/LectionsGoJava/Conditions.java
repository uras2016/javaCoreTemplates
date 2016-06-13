package Threads.LectionsGoJava;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Conditions {

    public static void main(String[] args) {
        TransferQueue<String> transferQueue = new TransferQueue<>(10);
        IntStream.range(0, 5).forEach((i) -> new Thread(() -> {  // создаем 5 потоков, в каждый передаем следующий Runnable

            while (true){
                try {
                    Thread.sleep(1000);

                    transferQueue.put(Thread.currentThread().getName()); // каждый поток кладет в "очередь" свое имя

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start());
        new Thread(() -> {   // создаем еще один поток
            while (true){
                try {
                    System.out.println("Taking out: " + transferQueue.take());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();



    }



    public static class TransferQueue<T>{

        private final Lock lock = new ReentrantLock();
        private final Condition full = lock.newCondition();
        private final Condition empty = lock.newCondition();




        Object[] items;

        int putIndex = 0;
        int takeIndex = 0;
        int size = 0;

        public TransferQueue(int capacity) {
            items = new Object[capacity];
        }

        public void put(T value) throws InterruptedException {  // кладет в голову
            lock.lock();

            try {
                while (size==items.length){
                    System.out.println("Queue is full. " + Thread.currentThread().getName() + "start waiting ...");
                    full.await();   // приостанавливает поток и отпускает лок. Держит по не визовут .signal
                                    }

            items[putIndex] = value;
            if (++putIndex == items.length){
                putIndex=0;
            };
            size++;

            // уведомляем потоки

            empty.signal();
            }finally {
                lock.unlock();
            }

        }

        public T take() throws InterruptedException {  // достает из хвоста
            lock.lock();
            try {

                while (size==0){
                    System.out.println("Queue is empty. " + Thread.currentThread().getName() + "start waiting ...");

                    empty.await();
                }


                T result = (T) items[takeIndex];
                if (++takeIndex == items.length){
                    takeIndex=0;
                }
                size--;
                // уведомляем потоки, которые ждут на добавление. После того, как положили

                full.signal();
                return result;
            }finally {
                lock.unlock();
            }
        }

    }
}
