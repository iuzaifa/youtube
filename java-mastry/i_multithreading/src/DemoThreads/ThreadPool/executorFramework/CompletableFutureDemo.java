package DemoThreads.ThreadPool.executorFramework;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating...");
            return 10 * 10;
        });

        // Non-blocking callback
        future.thenAccept(result -> System.out.println("Result: " + result));

        // Ensure main thread doesn’t exit early
        Thread.sleep(2000);

        System.out.println(future.get());
        System.out.println(future.complete(100));
    }
}
