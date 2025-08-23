package DemoThreads;

public class WithDaemon extends Thread {



    /**
     * Daemon Thread -> Daemon Thread is a background thread, but jvm not wait for Daemon Thread to end,
     * When all user threads finish, the JVM will automatically kill all daemon threads
     * (even if they’re still running).
     *
     * */


    @Override
    public void run() {
        while (true){
            System.out.println("Hey World");
        }
    }


    public static void main(String[] args) throws InterruptedException {

        WithDaemon withDaemon = new WithDaemon();
        withDaemon.setDaemon(true);
        withDaemon.start();

        System.out.println("Main thread running...");
        Thread.sleep(2000);
        System.out.println("Main thread finished!");


    }
}
