package DemoThreads.synchronization.readWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLockAndWriteLock {

    private int count = 0;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();

    public void increment(){
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try {
            return count;
        }finally {
            readLock.unlock();
        }
    }





    public static void main(String[] args) throws InterruptedException {

        ReadLockAndWriteLock counter = new ReadLockAndWriteLock();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<= 10; i++){
                    System.out.println(Thread.currentThread().getName()  + " read " + counter.getCount());
                }
            }
        };


        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<= 10; i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()  + " : Incremented");
                }
            }
        };


        Thread writeThread = new Thread(writeTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final Count "+ counter.getCount());

    }
}
