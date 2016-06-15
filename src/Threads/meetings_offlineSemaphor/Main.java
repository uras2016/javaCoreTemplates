package Threads.meetings_offlineSemaphor;

public class Main {
    static final Producer producer = new Producer();
    static final Consumer consumer = new Consumer();

    public static void main(String[] args) {
        new Thread(producer).start();
        new Thread(consumer).start();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}