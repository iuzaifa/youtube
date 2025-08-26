package DemoThreads.ThreadPool.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExThreadPool {
    public static void main(String[] args) {

//        Long start = System.currentTimeMillis();
//
//        ExecutorService executors = Executors.newFixedThreadPool(5);
//        for (int i = 1; i <= 10; i++){
//            final int ii = i;
//            executors.submit(()->{
//                long result = factorial(ii);
//                System.out.println("Factorial of " + ii + " = " + result);
//
//            });
//
//        }
//        executors.shutdown();
//
//        try {
//            executors.awaitTermination(1, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        long end = System.currentTimeMillis();
//        long elapsedTimeInSec = (end - start) / 1000;
//        System.out.println("Elapsed time: " + elapsedTimeInSec + " seconds");




        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[9];

        for (int i = 1; i<=10; i++){
            final  int finalI = i;
            threads[i - 1] = new Thread(
                    ()-> {
                        long result = factorial(finalI);
                        System.out.println(result);
                    }
            );
            threads[i-1].start();
        }

        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Total Time is " + (System.currentTimeMillis() - start) );
    }

    public static int factorial(int n){
        int temp = 1;
        for (int i = 1; i <= n; i++){
            try {
                Thread.sleep(1);
                temp *= i;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return temp;
    }
}
