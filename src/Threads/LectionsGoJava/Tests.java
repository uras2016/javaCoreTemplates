package Threads.LectionsGoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Tests {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        new Tests().test();
    }

    public void test() throws InterruptedException, ExecutionException {
        List<Callable<String>> callables = new ArrayList<>();
        IntStream.range(0, 3).forEach(i -> callables.add(() -> String.valueOf(i)));

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<String>> result = executor.invokeAll(callables);

        for (Future f : result) {
            System.out.println(f.get());
        }
        executor.shutdown();
    }
}

