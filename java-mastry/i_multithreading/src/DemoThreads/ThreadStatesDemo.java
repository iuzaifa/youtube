package DemoThreads;

public class ThreadStatesDemo extends Thread{

    @Override
    public void run() {


        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        ThreadStatesDemo thread = new ThreadStatesDemo();


        System.out.println( thread.getState()); //  NEW

        thread.start();
        System.out.println(  thread.getState()); // RUNNABLE

        Thread.sleep(10);
        System.out.println(thread.getState()); // TIMED_WAITING
        Thread.sleep(500);
        thread.join();
        System.out.println(thread.getState()); // TERMINATED
    }
}
