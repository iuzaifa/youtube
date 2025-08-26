package DemoThreads.threadCommunication.test;

public class PrintOddEvent {

    int num = 1;
    final int MAX_VALUE = 10;

    public synchronized void printOdd() throws InterruptedException {
        while (num <= MAX_VALUE ){
            if (num % 2 == 0){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " : " + num);
            num++;
            notify();
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (num <= MAX_VALUE){
            if (num % 2 != 0 ){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " : " + num);
            num++;
            notify();
        }
    }

    public static void main(String[] args) {

        PrintOddEvent printOddEvent = new PrintOddEvent();

        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printOddEvent.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printOddEvent.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        even.setName("Thread Even ");
        odd.setName("Thread Odd ");

        odd.start();
        even.start();

    }
}
