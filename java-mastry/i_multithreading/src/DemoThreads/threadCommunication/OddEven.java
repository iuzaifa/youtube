package DemoThreads.threadCommunication;

public class OddEven extends Thread {

    public static void main(String[] args) {

        EvenNumber ev = new EvenNumber();
        OddNumber od = new OddNumber();

        ev.start();
        od.start();

    }

}


