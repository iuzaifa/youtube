package DemoThreads;


public class WithYield extends Thread {
    public WithYield(String name) {
        super(name);
    }


     /**
      * Thread.yield(); ->
      *      Thread.yield() in Java is a static method. Its job is to give a hint to the thread
      *      scheduler that "I want to take a little rest now; if there is any other thread that
      *      needs to run, please give it a chance
      * */

     @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {

        WithYield a = new WithYield("A -> ");
        WithYield b = new WithYield("B -> ");
        WithYield c = new WithYield("C -> ");

        a.start();
        b.start();
        c.start();

    }
}
