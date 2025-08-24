package DemoThreads.deadlocks;


class Pen {}
class Paper {}
public class DeadlockExample {

    private final Pen pen = new Pen();
    private final Paper paper = new Paper();

    public void writeWithPenThenPaper(){

        synchronized (pen){
            System.out.println(Thread.currentThread().getName() + " locked Pen A");
            try{
                Thread.sleep(100);
            } catch (InterruptedException _ ) {
            }
            synchronized(paper){
                System.out.println(Thread.currentThread().getName() + " locked paper A");
            }
        }

    }

    public void writeWithPaperThenPen(){
        synchronized (paper){
            System.out.println(Thread.currentThread().getName() + " locked paper B");
            try{
                Thread.sleep(100);
            } catch (InterruptedException _ ) {
            }
            synchronized (pen){
                System.out.println(Thread.currentThread().getName() + " locked Pen");
            }
        }

    }

    public static void main(String[] args) {
        DeadlockExample example = new DeadlockExample();

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                example.writeWithPenThenPaper();
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                example.writeWithPaperThenPen();
            }
        };

        Thread t1 = new Thread(task1, "Thread 1");
        Thread t2 = new Thread(task2, "Thread 2");

        t1.start();
        t2.start();
    }
}


