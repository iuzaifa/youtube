package DemoThreads.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        Runnable task = () -> {
            System.out.println( "Thread is working "  +  Thread.currentThread().getName());

        };
        Runnable task2 = () -> {
            System.out.println( "Thread is working "  +  Thread.currentThread().getName());

        };

        Runnable task3 = () -> {
            System.out.println( "Thread is working "  +  Thread.currentThread().getName());

        };


        executor.submit(task);
        executor.submit(task2);
        executor.submit(task3);
        executor.shutdownNow();



//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//        for (int i = 1; i <= 5; i++){
//            final int taskId = i;
//            executor.submit(()->{
//                System.out.println("Task " + taskId + " executed by "  +  Thread.currentThread().getName());
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//        }
//
//        executor.shutdown();
    }

}
