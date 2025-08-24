package DemoThreads.threadCommunication;

import java.lang.constant.ModuleDesc;

public class PrintOddEvent {

    int num = 1;
    final int MAX_VALUE = 10;

    public synchronized void printEven() throws InterruptedException {
        while (num <= MAX_VALUE) {
            if (num % 2 != 0) {
                wait();
            }
                // num%2 == 0 --> Even
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
                notify();

        }
    }

    public synchronized void printOdd() throws InterruptedException {
        while (num <= MAX_VALUE) {
            if (num % 2 == 0) {
                wait();
            }
                // num%2 != 0 --> ODD
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
                notify();

        }
    }

    public static void main(String[] args) {

        PrintOddEvent obj = new PrintOddEvent();

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        oddThread.setName("ODD_THREAD");
        evenThread.setName("EVEN_THREAD");
        oddThread.start();
        evenThread.start();

    }

}
