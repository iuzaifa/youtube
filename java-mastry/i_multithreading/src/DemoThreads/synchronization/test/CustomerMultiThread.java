package DemoThreads.synchronization.test;

public class CustomerMultiThread {
    public static void main(String[] args) {

        Bank bank1 = new Bank(400);
        Bank bank2 = new Bank(900);


        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                bank1.withdraw(300);
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                bank2.withdraw(450);
            }
        };


        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable1);

        Thread t3 = new Thread(runnable2);
        Thread t4 = new Thread(runnable2);
        Thread t5 = new Thread(runnable2);
        Thread t6 = new Thread(runnable2);


        t1.setName("Ali");
        t2.setName("Bilal");
        t3.setName("Emran");
        t4.setName("Faheem");
        t5.setName("Hummad");
        t6.setName("Kaif");


        t1.start(); t2.start();
        t3.start(); t4.start();
        t5.start(); t6.start();




    }
}

class Bank {
    private int balance = 500;

    Bank (int balance){
        this.balance = balance;
    }

    public synchronized void withdraw(int amount){
        String name = Thread.currentThread().getName();
        if (balance >= amount){
            System.out.println(name + " : withdraw " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        }else {
            System.out.println(name + " : Insufficient Balance for " + amount);
        }
    }


}
