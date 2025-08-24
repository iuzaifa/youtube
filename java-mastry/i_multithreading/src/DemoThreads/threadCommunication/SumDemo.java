package DemoThreads.threadCommunication;

public class SumDemo extends Thread{
    int sum = 0;

    @Override
    public void run() {
       synchronized (this){
           for (int i = 1; i <= 50; i++){
               sum += i;
           }
          this.notify();
           System.out.println("(class SumDemo {... } ) The sum is : " + sum); // 1275
       }
    }
}
