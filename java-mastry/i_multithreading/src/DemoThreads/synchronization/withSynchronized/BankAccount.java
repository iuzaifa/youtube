package DemoThreads.synchronization.withSynchronized;

public class BankAccount {

    int balance = 500;

    /**
     * Without Synchronization:
     * If withdraw is not synchronized, then multiple threads
     * can withdraw money from the account at the same time,
     * even if the balance is insufficient.
     * Example:
     * Thread-1 is withdrawing 300
     * Thread-2 is withdrawing 300
     * Remaining balance: 200
     * Remaining balance: -100   (Incorrect result)
     *
     * With Synchronization:
     * Only one thread can withdraw at a time.
     * Example:
     * Thread-1 is withdrawing 300
     * Remaining balance: 200
     * Thread-2 - Not enough balance!
     */

    synchronized void withdraw(int amount) {
        if (balance >= amount){
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " - Not enough balance!");

        }
    }
}

