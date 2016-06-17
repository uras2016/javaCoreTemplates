package Threads.simpleThreads.threadsTemplateRunnable;

public class Threads1 {

   static SomethingRunnable runnable;

    public static void main(String[] args) {

        runnable = new SomethingRunnable();

        System.out.println("Workout started");

        Thread thread1 = new Thread(runnable); // add обьект класса
        thread1.start();


        System.out.println("Workout finished");




    }
}
