package DemoThreads.synchronization;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();
        SyncThread a = new SyncThread(counter);
        SyncThread b = new SyncThread(counter);
        a.start();
        b.start();
        try {
            a.join();
            b.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(counter.getCount());







    }
}
