package DemoThreads.synchronization.fairnessExes;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairAndUnfairLocks {


    private final Lock lock = new ReentrantLock(true); // true / false

    public void accessResource(String threadName) {
        lock.lock();
        try {
            System.out.println(threadName + " acquired the lock");
            Thread.sleep(1000);

        }catch (InterruptedException e){}
        finally {
            System.out.println(threadName + " Lock released ");
            lock.unlock();
        }
    }



    public static void main(String[] args) {

        FairAndUnfairLocks locks = new FairAndUnfairLocks();

        Runnable runnable = ()-> {
            locks.accessResource(Thread.currentThread().getName());
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();


    }
}
