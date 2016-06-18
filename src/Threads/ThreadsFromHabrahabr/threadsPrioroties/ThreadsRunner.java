package Threads.ThreadsFromHabrahabr.threadsPrioroties;

import java.util.ArrayList;
import java.util.List;

public class ThreadsRunner {



    public static void main(String[] args) throws InterruptedException {
        System.out.println("Workout started");



        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {



                System.out.println("Start Runnable1");
                List<Integer> list = new ArrayList<>(10);
                for (int i = 10; i > 0; i--) {
                    list.add(i);
                }
                for (Integer integer : list) {
                    System.out.println(integer);
                }
                System.out.println("Finish Runnable1");


            }
        });
        thread1.start();



        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Start Runnable2");
                List<Integer> list = new ArrayList<>(10);
                for (int i = 0; i < 10; i++) {
                    list.add(i);
                }
                for (Integer integer : list) {
                    System.out.println(integer);
                }
                System.out.println("Finish Runnable2");
            }
        });
        thread2.start();

        thread2.join();  // команда, чтобы главный поток подождал завершения побочного потока

        System.out.println("Workout finished");

    }
}
