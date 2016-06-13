package Threads.LectionsGoJava;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomics {
    private static AtomicInteger counter = new AtomicInteger(0);  // equivalent to private static int counter


    public static void main(String[] args) {
        new Atomics().test();
    }


    public static int increment(){
        return counter.incrementAndGet();  // equivalent to counter++
    }
    private void test() {
//        List<Aggregator> aggregator = new ArrayList<>();


    }
}
