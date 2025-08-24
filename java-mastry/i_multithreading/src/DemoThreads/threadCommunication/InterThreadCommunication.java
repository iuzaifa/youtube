package DemoThreads.threadCommunication;


public class InterThreadCommunication {

    public static void main(String[] args) throws InterruptedException {
        SumDemo th = new SumDemo();
        th.start();
        synchronized (th){
           th.wait();
           System.out.println("Total Sum is : " + th.sum); // 0
        }



    }

}
