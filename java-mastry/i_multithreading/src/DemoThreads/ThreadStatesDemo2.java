package DemoThreads;


public class ThreadStatesDemo2 extends Thread{


    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++){
                Thread.sleep(2000);
                System.out.println(i);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        ThreadStatesDemo2 t1 =  new ThreadStatesDemo2();
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(5000);
        System.out.println("Hello");

    }

}
