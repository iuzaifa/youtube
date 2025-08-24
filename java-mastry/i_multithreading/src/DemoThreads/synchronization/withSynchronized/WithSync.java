package DemoThreads.synchronization.withSynchronized;

public class WithSync {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread a = new Thread(()-> account.withdraw(300), "Thread : 1");
        Thread b = new Thread(()-> account.withdraw(300), "Thread : 2");

        a.start();
        b.start();


        
    }
}
