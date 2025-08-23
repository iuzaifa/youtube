package DemoThreads;

public class InterruptThreads extends Thread {


    @Override
    public void run() {

        try {
           for (int i = 1; i <=3; i++){
               System.out.println("Working... " + i);
               Thread.sleep(2000);

           }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread exiting...");
    }

    public static void main(String[] args) throws InterruptedException {

        InterruptThreads threads = new InterruptThreads();
        threads.start();
        Thread.sleep(2500);
        threads.interrupt();


    }
}
