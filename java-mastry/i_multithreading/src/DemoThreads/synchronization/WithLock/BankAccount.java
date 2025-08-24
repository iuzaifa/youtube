package DemoThreads.synchronization.WithLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount{

    private int balance  = 1000;
    private final Lock lock = new ReentrantLock();

    public void withdraw(String user, int amount){
        lock.lock();
       try  {
           System.out.println( user + " withdrawal amount is " + amount);
           if (balance >= amount){
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               balance -= amount;
               System.out.println(user + " completed withdrawal, Remaining balance: " + balance + " and amount - "+ amount);
           }else {
               System.out.println("Not insufficient Balance to withdraw amount is "+ amount + " and Remaining balance is "+ balance);
           }
       }catch (Exception e){
           Thread.currentThread().interrupt();
       }
       finally {
           lock.unlock();
       }
    }

}
