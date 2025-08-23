package DemoThreads;

public class ThreadPriority extends Thread {
    public ThreadPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++ ){
            String a = "";
            for (int j = 0; j <= 100000l; j++){
                a += "a";

            }
            System.out.println(getName() + "  running with priority " + getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadPriority thread = new ThreadPriority("huzaifa");
        thread.start();

        ThreadPriority h = new ThreadPriority("huzaifa");
        ThreadPriority m = new ThreadPriority("huzaifa");
        ThreadPriority l = new ThreadPriority("huzaifa");

        h.setPriority(ThreadPriority.MAX_PRIORITY);
        m.setPriority(ThreadPriority.NORM_PRIORITY);
        l.setPriority(ThreadPriority.MIN_PRIORITY);

        h.start();
        m.start();
        l.start();




    }
}
