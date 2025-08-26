package DemoThreads.ThreadPool.executorFramework;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int taskCount = 3;
        CountDownLatch latch = new CountDownLatch(taskCount);

        for (int i = 1; i <= taskCount; i++) {
            int taskId = i;
            new Thread(() -> {
                try {
                    System.out.println("Task " + taskId + " is running...");
                    Thread.sleep(1000 * taskId); // simulate work
                    System.out.println("Task " + taskId + " finished!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown(); // reduce count by 1
                }
            }).start();
        }

        // Main thread waits until all tasks are done
        latch.await();  
        System.out.println("All tasks completed. Proceeding...");
    }
}
