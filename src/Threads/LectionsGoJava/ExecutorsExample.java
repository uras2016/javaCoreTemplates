package Threads.LectionsGoJava;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ExecutorsExample {

    public static void main(String[] args) throws Exception {
//    new ExecutorsExample().testExecute();
//    new ExecutorsExample().testExecutorService();
//    new ExecutorsExample().testInvokeAny();
//      new ExecutorsExample().testInvokeAll();
//      new ExecutorsExample().testScheduled();

        new ExecutorsExample().testScheduledAtgFixedRate();

    }
    public void testExecute(){

        // newFixedThreadPool(10);  10 - кол потоков, которые хотим создать
        Executor executor = Executors.newSingleThreadExecutor();
        System.out.println(Thread.currentThread().getName() + " submits task");
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": Async task started");
            }
        });

    }

    public void testExecutorService() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> f = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return  "Task executed";
            }
        });
        System.out.println("Waiting for result");
        System.out.println();
        System.out.println("result: " + f.get()); // f.get будет ждать пока выполниться метод .call()

        executorService.shutdown();
    }

    public void testInvokeAny() throws ExecutionException, InterruptedException {
        List<Callable<String>> callables = new ArrayList<>();
        Random random = new Random();
        IntStream.range(0, 3).forEach((i) -> callables.add(() -> {
                    Thread.sleep(random.nextInt(1000));
                    return String.valueOf(i);
                }));
        ExecutorService executorService = Executors.newCachedThreadPool();
        String result = executorService.invokeAny(callables); // вернет первый успешно выполненный результат

        System.out.println(result);
        executorService.shutdown();
    }

    public void testInvokeAll() throws ExecutionException, InterruptedException {
        List<Callable<String>> callables = new ArrayList<>();
        Random random = new Random();
        IntStream.range(0, 3).forEach((i) -> callables.add(() -> {
            Thread.sleep(random.nextInt(1000));
            return String.valueOf(i);
        }));
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> result = executorService.invokeAll(callables); // вернет все результаты

        for (Future f : result) {
            System.out.println(f.get());
        }

        executorService.shutdown();
    }

    public void testScheduled(){
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Task scheduler" + new Date());
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed" + new Date());
            }
        }, 1, TimeUnit.SECONDS);

    }

    public void testScheduledAtgFixedRate() throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Task scheduler" + new Date());
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed" + new Date());
            }
        }, 1, 1, TimeUnit.SECONDS);
        Thread.sleep(10000);
        executorService.shutdown();

    }
}
