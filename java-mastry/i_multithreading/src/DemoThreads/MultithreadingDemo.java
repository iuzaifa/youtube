package DemoThreads;

public class MultithreadingDemo{

    public static void main(String[] args) {

        AThread a  = new AThread();
        a.start();

        BRunnable bRunnable = new BRunnable();
        Thread thread = new Thread(bRunnable);
        thread.start();

    }



}

class AThread extends Thread{
    @Override
    public void run() {
        for ( ; ; ){
            System.out.println(" Thread ");
            System.out.println(Thread.currentThread().getName());

        }

    }
}

class  BRunnable implements Runnable{

    @Override
    public void run() {
        for ( ;; ){
            System.out.println("Runnable");

            System.out.println(Thread.currentThread().getName());
        }
    }
}