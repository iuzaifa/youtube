package DemoThreads.synchronization;

public class Counter {

    int count = 0;

    public void increment(){
       synchronized (this){
           count++;
       }
    }

    public int getCount(){
        return count;
    }
}
