package DemoThreads.ThreadPool.executorFramework;

import java.util.concurrent.*;

public class RunnableCallableThreads {
    public static void main(String[] args) throws ExecutionException, InterruptedException , Exception {


        ExecutorService executor = Executors.newFixedThreadPool(2);

//        Future<Integer> future = executor.submit(()-> 2 + 5);
//        Integer i = future.get();
//        System.out.println("sum is : "+ i);
//        executor.shutdown();
//        Thread.sleep(1);
//        System.out.println(executor.isTerminated());


        // Runnable Thread

        RunnableTest runnableTest = new RunnableTest();
        Future<?> future = executor.submit(runnableTest);
        System.out.println(future.get());
        executor.shutdown();

        System.out.println(executor.isShutdown());





        // CallableTest Thread
//        CallableTest callableTest = new CallableTest();
//        Future<Integer> future2 = executor.submit(callableTest);
//        System.out.println("Result: " + future2.get()); // waits & gets result
//        executor.shutdownNow();
//        System.out.println(executor.isShutdown());
    }
}

class CallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        Thread.sleep(0);
        return 20 * 5;
    }
}


class RunnableTest implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Runnable Thread");

    }
}