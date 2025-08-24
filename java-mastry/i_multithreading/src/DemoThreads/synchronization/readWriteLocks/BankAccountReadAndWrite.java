package DemoThreads.synchronization.readWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BankAccountReadAndWrite {

    private int balance = 3500;

    // readWrite
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    // write
    private final Lock writeLock = readWriteLock.writeLock();

    // read
    private final Lock readLock = readWriteLock.readLock();

    // Writer -> Deposit amount +=
    public void depositAmount(String user,int amount){
        writeLock.lock();
        try {
            System.out.println(user + " Deposit amount in account "  + amount + " : " + balance );
            balance += amount;
            Thread.sleep(1000);
            System.out.println(user + " Total Amount is "+ balance );

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            writeLock.unlock();
        }
    }

    // Read /  Checks Amounts
    public void checkAmount(String user){
        readLock.lock();

        try {
            System.out.println(user + " Checking balance " + balance);
            Thread.sleep(500);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            readLock.unlock();
        }
    }



    public static void main(String[] args) {
        BankAccountReadAndWrite account  = new BankAccountReadAndWrite();

        Runnable depositAmount = new Runnable (){

            @Override
            public void run() {
                account.depositAmount("Ali", 500);
            }
        };

        Runnable checkBalance = new Runnable() {
            @Override
            public void run() {
                account.checkAmount("Ali");
                System.out.println();
            }
        };


        Thread deposit1 = new Thread(depositAmount);
        Thread deposit2 = new Thread(depositAmount);
        Thread checkAmount2 = new Thread(checkBalance);
        Thread deposit3 = new Thread(depositAmount);
        Thread checkAmount1 = new Thread(checkBalance);
        Thread checkAmount3 = new Thread(checkBalance);

        deposit1.start();
        deposit2.start();
        deposit3.start();

        checkAmount1.start();
        checkAmount2.start();
        checkAmount3.start();


    }

}
