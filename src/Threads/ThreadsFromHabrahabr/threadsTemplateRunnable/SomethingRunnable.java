package Threads.ThreadsFromHabrahabr.threadsTemplateRunnable;

import java.util.ArrayList;
import java.util.List;

public class SomethingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Start Runnable");

        List<Integer> list = new ArrayList<>(10);
        arrayListPopulate(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("Finish Runnable");

    }

    private void arrayListPopulate(List<Integer> list){
        for (int i=1; i<=10;i++){
            list.add(i);
        }
    }
}
