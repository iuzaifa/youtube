package DemoThreads.synchronization.WithLock;

public class Main {

    public static void main(String[] args) {
        BankAccount account  = new BankAccount();

        Thread a = new Thread(() -> account.withdraw("Ali: ", 300));
        Thread b = new Thread(() -> account.withdraw("Hamza : ", 300));
        Thread c = new Thread(() -> account.withdraw("Salim : ", 300));
        Thread d = new Thread(() -> account.withdraw("Alim : ", 300));

        a.start();
        b.start();
        c.start();
        d.start();





    }
}
