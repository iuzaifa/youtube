package DemoThreads.ThreadPool.executorFramework;

import java.util.concurrent.*;

public class DependentServicesMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<String> future1 = service.submit(new DependentServices());
        Future<String> future2 = service.submit(new DependentServices());
        Future<String> future3 = service.submit(new DependentServices());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("All Dependent services finished starting main..... ");
        service.shutdown();

    }
}

class DependentServices implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started");
        Thread.sleep(2000);
        return "OK";
    }
}