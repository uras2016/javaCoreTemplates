package Threads.LectionsGoJava;


import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws Exception {
//    new ExecutorsExample().testExecute();
        new ExecutorsExample().testExecutorService();

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

}
