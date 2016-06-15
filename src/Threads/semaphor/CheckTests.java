package Threads.semaphor;

public class CheckTests {
    public static void main(String[] args) {
        Worker worker = new Worker();
        new Thread(worker).start();
        new Thread(worker).start();
    }

    public static class Worker implements Runnable {

        @Override
        public void run() {
            try {
                doSomething();
                doSomething();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public synchronized void doSomething() throws InterruptedException {
            System.out.println("Do something in thread " + Thread.currentThread().getName());
            wait();
            Thread.sleep(1000);
        }
    }
}
